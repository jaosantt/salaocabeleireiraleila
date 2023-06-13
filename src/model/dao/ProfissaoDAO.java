package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Funcao;
import model.Profissao;
import model.Servico;

public class ProfissaoDAO{
    
    public static List<Profissao> read() {
        Connection con = ModelConnect.getConectar();
        List<Profissao> list = new ArrayList<>();
        String sql = "SELECT * FROM profissao as p";

        try (PreparedStatement smt = con.prepareStatement(sql)) {
            ResultSet result = smt.executeQuery();
            while (result.next()) {
                Profissao p = new Profissao();
                p.setId(result.getInt("p.id_profissao"));
                p.setDescricao(result.getString("p.prof_descricao"));
                list.add(p);

            }
            con.close();
            smt.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Nenhum registro encontrado.");
            System.out.println(ex);
        }

        return list;

    }
    
    public static List<Funcao> selectFuncaoById(String s) {
        Connection con = ModelConnect.getConectar();
        List<Funcao> list = new ArrayList<>();
        String sql = "SELECT * FROM funcao as f "
                   + "INNER JOIN tipo_tratamento as t "
                   + "ON f.id_tp_tratamento = t.id_tp_tratamento "
                   + "WHERE f.id_tp_tratamento = ?";

        try (PreparedStatement smt = con.prepareStatement(sql)) {
            smt.setString(1, s);
            ResultSet result = smt.executeQuery();
            while (result.next()) {
                Funcao f = new Funcao();
                f.setId(result.getInt("f.id_funcao"));
                f.setDescricao(result.getString("f.func_descricao"));
                f.setId_tratamento(result.getInt("f.id_tp_tratamento"));
                f.setTratamento(result.getString("t.trat_desc"));
                list.add(f);

            }
            con.close();
            smt.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Nenhum registro encontrado.");
            System.out.println(ex);
        }

        return list;

    }
    
    public static Servico selectServico(String funcao, String funcionario) {
        Connection con = ModelConnect.getConectar();
        Servico s = new Servico();
        String sql = "SELECT * FROM servico as s "
                   + "INNER JOIN profissao as p "
                   + "ON s.id_profissao = p.id_profissao "
                   + "INNER JOIN funcao as f "
                   + "ON s.id_funcao = f.id_funcao "
                   + "INNER JOIN funcionario as fun "
                   + "ON fun.id_profissao = p.id_profissao "
                   + "WHERE f.func_descricao = ? AND fun.fun_nome = ?";

        try (PreparedStatement smt = con.prepareStatement(sql)) {
            smt.setString(1, funcao);
            smt.setString(2, funcionario);
            ResultSet result = smt.executeQuery();
            result.next();
            
            s.setId(result.getInt("s.id_servico"));
            s.setId_profissao(result.getInt("s.id_profissao"));
            s.setId_funcao(result.getInt("s.id_servico"));
            s.setValor(result.getDouble("s.id_servico"));
            s.setTempo(result.getDouble("s.id_servico"));
           

            con.close();
            smt.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Nenhum registro encontrado.");
            System.out.println(ex);
        }

        return s;

    }
    
}