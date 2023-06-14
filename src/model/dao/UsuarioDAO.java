package model.dao;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Usuario;
import model.enums.StatusUsuario;

public class UsuarioDAO {

    public static void create(Usuario u) {
        Connection con = ModelConnect.getConectar();
        Usuario aux;

        String sql = "INSERT INTO clientes (cli_nome, cli_cpf, cli_sexo,"
                + "cli_telefone, cli_email, cli_endereco, cli_bairro, cli_cep, cli_cidade)"
                + "VALUES(?,?,?,?,?,?,?,?,?)";

        try (PreparedStatement smt = con.prepareStatement(sql)) {

            smt.setString(1, u.getNome());
            smt.setString(2, u.getCpf());
            smt.setString(3, Character.toString(u.getSexo()));
            smt.setString(4, u.getTelefone());
            smt.setString(5, u.getEmail());
            smt.setString(6, u.getEndereco());
            smt.setString(7, u.getBairro());
            smt.setString(8, u.getCep());
            smt.setString(9, u.getCidade());
            smt.executeUpdate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar.");
            System.out.println(ex);
        }

        aux = UsuarioDAO.selectByCpf(u);

        sql = "INSERT INTO usuario(login,senha,id_cliente,user_status)"
                + "VALUES(?,?,?,'USER');";

        try (PreparedStatement smt = con.prepareStatement(sql)) {

            smt.setString(1, u.getLogin());
            smt.setString(2, u.getPassword());
            smt.setInt(3, aux.getId());
            smt.executeUpdate();
            smt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar.");
            System.out.println(ex);
        }

    }

    public static List<Usuario> read() {
        Connection con = ModelConnect.getConectar();
        List<Usuario> list = new ArrayList<>();
        String sql = "SELECT * FROM usuario AS u "
                + "INNER JOIN clientes AS c "
                + "ON c.id_cliente = u.id_cliente "
                + "ORDER BY c.cli_nome";

        try (PreparedStatement smt = con.prepareStatement(sql)) {
            ResultSet result = smt.executeQuery();
            while (result.next()) {
                Usuario u = new Usuario();
                u.setId(result.getInt("c.id_cliente"));
                u.setNome(result.getString("c.cli_nome"));
                u.setCpf(result.getString("c.cli_cpf"));
                u.setSexo(result.getString("c.cli_sexo").charAt(0));
                u.setTelefone(result.getString("c.cli_telefone"));
                u.setEmail(result.getString("c.cli_email"));
                u.setEndereco(result.getString("c.cli_endereco"));
                u.setBairro(result.getString("c.cli_bairro"));
                u.setCep(result.getString("c.cli_cep"));
                u.setCidade(result.getString("c.cli_cidade"));
                u.setUser(result.getInt("u.id_usuario"));
                u.setLogin(result.getString("u.login"));
                u.setPassword(result.getString("u.senha"));
                list.add(u);

            }
            con.close();
            smt.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Nenhum registro encontrado.");
            System.out.println(ex);
        }

        return list;

    }

    public static void update(Usuario u) {
        Connection con = ModelConnect.getConectar();
        String sql = "UPDATE clientes SET cli_nome = ?,cli_cpf = ?, cli_sexo = ?, "
                + "cli_telefone = ?, cli_email = ?, cli_endereco = ?, cli_bairro = ?,"
                + "cli_cep = ?, cli_cidade = ? WHERE id_cliente = ?";

        try (PreparedStatement smt = con.prepareStatement(sql)) {
            smt.setString(1, u.getNome());
            smt.setString(2, u.getCpf());
            smt.setString(3, Character.toString(u.getSexo()));
            smt.setString(4, u.getTelefone());
            smt.setString(5, u.getEmail());
            smt.setString(6, u.getEndereco());
            smt.setString(7, u.getBairro());
            smt.setString(8, u.getCep());
            smt.setString(9, u.getCidade());
            smt.setInt(10, u.getId());
            smt.executeUpdate();
            smt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar.");
            System.out.println(ex);
        }

    }

    public static void delete(Usuario u) {
        Connection con = ModelConnect.getConectar();
        String sql = "DELETE FROM clientes WHERE id_cliente = ?";

        int opcao = JOptionPane.showConfirmDialog(null, "Deseja excluir o usuário " + u.getNome()
                + "?", "Excluir", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            try (PreparedStatement smt = con.prepareStatement(sql)) {
                smt.setInt(1, u.getId());
                smt.executeUpdate();
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir.");
            }
            
            sql = "DELETE FROM usuario WHERE id_cliente = ?";
            try (PreparedStatement smt = con.prepareStatement(sql)) {
                smt.setInt(1, u.getId());
                smt.executeUpdate();
                smt.close();
                con.close();
                JOptionPane.showMessageDialog(null, "Item excluido com sucesso.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir.");
                System.out.println(ex);
            }
        }

    }

    public static Usuario selectByUserPassword(Usuario user) {
        Connection con = ModelConnect.getConectar();
        String sql = "SELECT * FROM usuario AS u "
                + "INNER JOIN clientes AS c "
                + "ON c.id_cliente = u.id_cliente "
                + "WHERE u.login = ? AND  u.senha = ?";

        Usuario u = new Usuario();

        try (PreparedStatement smt = con.prepareStatement(sql)) {
            smt.setString(1, user.getLogin());
            smt.setString(2, user.getPassword());

            ResultSet result = smt.executeQuery();
            result.next();
            u.setId(result.getInt("c.id_cliente"));
            u.setNome(result.getString("c.cli_nome"));
            u.setCpf(result.getString("c.cli_cpf"));
            u.setSexo(result.getString("c.cli_sexo").charAt(0));
            u.setTelefone(result.getString("c.cli_telefone"));
            u.setEmail(result.getString("c.cli_email"));
            u.setEndereco(result.getString("c.cli_endereco"));
            u.setBairro(result.getString("c.cli_bairro"));
            u.setCep(result.getString("c.cli_cep"));
            u.setCidade(result.getString("c.cli_cidade"));
            u.setUser(result.getInt("u.id_usuario"));
            u.setLogin(result.getString("u.login"));
            u.setStatus(StatusUsuario.valueOf(result.getString("u.user_status")));
            con.close();
            smt.close();

        } catch (Exception ex) {

            u = null;
        }
        return u;
    }

    public static Usuario selectByCpf(Usuario user) {
        Connection con = ModelConnect.getConectar();
        String sql = "SELECT * FROM clientes AS c"
                + "  WHERE c.cli_cpf = ?";

        Usuario u = new Usuario();

        try (PreparedStatement smt = con.prepareStatement(sql)) {
            smt.setString(1, user.getCpf());

            ResultSet result = smt.executeQuery();
            result.next();
            u.setId(result.getInt("c.id_cliente"));
            u.setNome(result.getString("c.cli_nome"));
            u.setCpf(result.getString("c.cli_cpf"));
            u.setSexo(result.getString("c.cli_sexo").charAt(0));
            u.setTelefone(result.getString("c.cli_telefone"));
            u.setEmail(result.getString("c.cli_email"));
            u.setEndereco(result.getString("c.cli_endereco"));
            u.setBairro(result.getString("c.cli_bairro"));
            u.setCep(result.getString("c.cli_cep"));
            u.setCidade(result.getString("c.cli_cidade"));
            con.close();
            smt.close();

        } catch (Exception ex) {
            System.out.println(ex);
            u = null;
        }
        return u;
    }

    public static List<Usuario> selectByLike(String s) {
        Connection con = ModelConnect.getConectar();
        List<Usuario> list = new ArrayList<>();
        String sql = "SELECT * FROM clientes AS c"
                + "  WHERE c.cli_nome like ?";

        try (PreparedStatement smt = con.prepareStatement(sql)) {
            smt.setString(1, s + "%");
            ResultSet result = smt.executeQuery();
            while (result.next()) {
                Usuario u = new Usuario();
                u.setId(result.getInt("c.id_cliente"));
                u.setNome(result.getString("c.cli_nome"));
                u.setCpf(result.getString("c.cli_cpf"));
                u.setSexo(result.getString("c.cli_sexo").charAt(0));
                u.setTelefone(result.getString("c.cli_telefone"));
                u.setEmail(result.getString("c.cli_email"));
                u.setEndereco(result.getString("c.cli_endereco"));
                u.setBairro(result.getString("c.cli_bairro"));
                u.setCep(result.getString("c.cli_cep"));
                u.setCidade(result.getString("c.cli_cidade"));
                list.add(u);

            }
            con.close();
            smt.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Nenhum registro encontrado.");
            System.out.println(ex);
        }

        return list;

    }

    public static Usuario selectById(String s) {
        Connection con = ModelConnect.getConectar();
        String sql = "SELECT * FROM clientes AS c"
                + "  WHERE c.id_cliente = ?";

        Usuario u = new Usuario();

        try (PreparedStatement smt = con.prepareStatement(sql)) {
            smt.setString(1, s);

            ResultSet result = smt.executeQuery();
            result.next();
            u.setId(result.getInt("c.id_cliente"));
            u.setNome(result.getString("c.cli_nome"));
            u.setCpf(result.getString("c.cli_cpf"));
            u.setSexo(result.getString("c.cli_sexo").charAt(0));
            u.setTelefone(result.getString("c.cli_telefone"));
            u.setEmail(result.getString("c.cli_email"));
            u.setEndereco(result.getString("c.cli_endereco"));
            u.setBairro(result.getString("c.cli_bairro"));
            u.setCep(result.getString("c.cli_cep"));
            u.setCidade(result.getString("c.cli_cidade"));
            con.close();
            smt.close();

        } catch (Exception ex) {
            System.out.println(ex);
            u = null;
        }
        return u;
    }

}
