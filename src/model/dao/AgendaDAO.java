package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.Agenda;
import model.AgendaAdmin;
import model.Usuario;

public class AgendaDAO {

    public static void create(Agenda agenda) {
        Connection con = ModelConnect.getConectar();

        String sql = "INSERT INTO agenda (agen_data, id_cliente, id_servico, id_situacao)"
                + "VALUES(?,?,?,1)";

        Timestamp timestamp = new Timestamp(agenda.getData().getTime());

        try (PreparedStatement smt = con.prepareStatement(sql)) {

            smt.setTimestamp(1, timestamp);
            smt.setInt(2, agenda.getId_cliente());
            smt.setInt(3, agenda.getId_servico());

            smt.executeUpdate();
            con.close();
            smt.close();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar.");
            System.out.println(ex);
        }

    }

    public static void updateSituacao(int id, String data, String hora) throws ParseException {
        Connection con = ModelConnect.getConectar();
        String sql = "UPDATE agenda SET id_situacao = ? WHERE agen_data = ?";
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date data_util = sdf.parse(data + " " + hora);
        
        try (PreparedStatement smt = con.prepareStatement(sql)) {
            smt.setInt(1, id);
            smt.setTimestamp(2, new Timestamp(data_util.getTime()));
            smt.executeUpdate();
            smt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar.");
            System.out.println(ex);
        }

    }

    public static void updateDataHora(String data, String hora, Date data_nova) throws ParseException {
        Connection con = ModelConnect.getConectar();
        String sql = "UPDATE agenda SET agen_data = ? WHERE agen_data = ?";
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date data_antiga = sdf.parse(data + " " + hora);
        
        
        try (PreparedStatement smt = con.prepareStatement(sql)) {
            smt.setTimestamp(1, new Timestamp(data_nova.getTime()));
            smt.setTimestamp(2, new Timestamp(data_antiga.getTime()));
            smt.executeUpdate();
            smt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar.");
            System.out.println(ex);
        }

    }
  
    public static List<AgendaAdmin> readAdmin() {
        Connection con = ModelConnect.getConectar();
        List<AgendaAdmin> list = new ArrayList<>();
        String sql = "SELECT * FROM agenda AS a "
                + "INNER JOIN clientes AS c "
                + "ON a.id_cliente = c.id_cliente "
                + "INNER JOIN servico AS s "
                + "ON a.id_servico = s.id_servico "
                + "INNER JOIN funcao as fc "
                + "ON fc.id_funcao = s.id_funcao "
                + "INNER JOIN profissao as p "
                + "ON p.id_profissao = s.id_profissao "
                + "INNER JOIN funcionario AS f "
                + "ON f.id_profissao = p.id_profissao "
                + "INNER JOIN situacao AS sit "
                + "ON a.id_situacao = sit.id_situacao "
                + "ORDER BY a.agen_data ";

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");

        try (PreparedStatement smt = con.prepareStatement(sql)) {
            ResultSet result = smt.executeQuery();
            while (result.next()) {
                AgendaAdmin agenda = new AgendaAdmin();
                Date date = new Date(result.getTimestamp("a.agen_data").getTime());
                agenda.setData_adm(dateFormat.format(date));
                agenda.setHora_adm(timeFormat.format(date));
                agenda.setCliente(result.getString("c.cli_nome"));
                agenda.setServico(result.getString("fc.func_descricao"));
                agenda.setFuncionario(result.getString("f.fun_nome"));
                agenda.setSituacao(result.getString("sit.sit_descricao"));
                list.add(agenda);

            }
            con.close();
            smt.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Nenhum registro encontrado.");
            System.out.println(ex);
        }

        return list;

    }
    
    public static List<AgendaAdmin> read(Usuario user) {
        Connection con = ModelConnect.getConectar();
        List<AgendaAdmin> list = new ArrayList<>();
        String sql = "SELECT * FROM agenda AS a "
                + "INNER JOIN clientes AS c "
                + "ON a.id_cliente = c.id_cliente "
                + "INNER JOIN usuario as u "
                + "ON c.id_cliente = u.id_cliente "
                + "INNER JOIN servico AS s "
                + "ON a.id_servico = s.id_servico "
                + "INNER JOIN funcao as fc "
                + "ON fc.id_funcao = s.id_funcao "
                + "INNER JOIN profissao as p "
                + "ON p.id_profissao = s.id_profissao "
                + "INNER JOIN funcionario AS f "
                + "ON f.id_profissao = p.id_profissao "
                + "INNER JOIN situacao AS sit "
                + "ON a.id_situacao = sit.id_situacao "
                + "WHERE u.id_usuario = ? "
                + "ORDER BY a.agen_data ";
                

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        
        try (PreparedStatement smt = con.prepareStatement(sql)) {
            smt.setInt(1, user.getUser());
            System.out.println("user = " + user.getUser());
            ResultSet result = smt.executeQuery();
            
            while (result.next()) {
                AgendaAdmin agenda = new AgendaAdmin();
                Date date = new Date(result.getTimestamp("a.agen_data").getTime());
                agenda.setData_adm(dateFormat.format(date));
                agenda.setHora_adm(timeFormat.format(date));
                agenda.setCliente(result.getString("c.cli_nome"));
                agenda.setServico(result.getString("fc.func_descricao"));
                agenda.setFuncionario(result.getString("f.fun_nome"));
                agenda.setSituacao(result.getString("sit.sit_descricao"));
                list.add(agenda);

            }
            con.close();
            smt.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Nenhum registro encontrado.");
            System.out.println(ex);
        }

        return list;

    }

}
