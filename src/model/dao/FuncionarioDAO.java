package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Funcionario;

public class FuncionarioDAO {

    public static void create(Funcionario f) {
        Connection con = ModelConnect.getConectar();

        String sql = "INSERT INTO funcionario (fun_nome, fun_cpf, id_profissao, fun_sexo,"
                + "fun_telefone, fun_email, fun_endereco, fun_bairro, fun_cep, fun_cidade)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?)";

        try (PreparedStatement smt = con.prepareStatement(sql)) {

            smt.setString(1, f.getNome());
            smt.setString(2, f.getCpf());
            smt.setInt(3, f.getId_profissao());
            smt.setString(4, Character.toString(f.getSexo()));
            smt.setString(5, f.getTelefone());
            smt.setString(6, f.getEmail());
            smt.setString(7, f.getEndereco());
            smt.setString(8, f.getBairro());
            smt.setString(9, f.getCep());
            smt.setString(10, f.getCidade());

            smt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar.");
            System.out.println(ex);
        }

    }

    public static List<Funcionario> read() {
        Connection con = ModelConnect.getConectar();
        List<Funcionario> list = new ArrayList<>();
        String sql = "SELECT * FROM funcionario AS f "
                + "INNER JOIN profissao AS p "
                + "ON f.id_profissao = p.id_profissao "
                + "ORDER BY f.fun_nome";

        try (PreparedStatement smt = con.prepareStatement(sql)) {
            ResultSet result = smt.executeQuery();
            while (result.next()) {
                Funcionario f = new Funcionario();
                f.setId(result.getInt("f.id_funcionario"));
                f.setNome(result.getString("f.fun_nome"));
                f.setCpf(result.getString("f.fun_cpf"));
                f.setSexo(result.getString("f.fun_sexo").charAt(0));
                f.setTelefone(result.getString("f.fun_telefone"));
                f.setEmail(result.getString("f.fun_email"));
                f.setEndereco(result.getString("f.fun_endereco"));
                f.setBairro(result.getString("f.fun_bairro"));
                f.setCep(result.getString("f.fun_cep"));
                f.setCidade(result.getString("f.fun_cidade"));
                f.setProfissao(result.getString("p.prof_descricao"));
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

    public static void update(Funcionario f) {
        Connection con = ModelConnect.getConectar();
        String sql = "UPDATE funcionario SET fun_nome = ?,fun_cpf = ?, fun_sexo = ?, "
                + "fun_telefone = ?, fun_email = ?, fun_endereco = ?, fun_bairro = ?,"
                + "fun_cep = ?, fun_cidade = ?, id_profissao = ? WHERE id_funcionario = ?";

        try (PreparedStatement smt = con.prepareStatement(sql)) {
            smt.setString(1, f.getNome());
            smt.setString(2, f.getCpf());
            smt.setString(3, Character.toString(f.getSexo()));
            smt.setString(4, f.getTelefone());
            smt.setString(5, f.getEmail());
            smt.setString(6, f.getEndereco());
            smt.setString(7, f.getBairro());
            smt.setString(8, f.getCep());
            smt.setString(9, f.getCidade());
            smt.setInt(10, f.getId_profissao());
            smt.setInt(11, f.getId());
            smt.executeUpdate();
            smt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar.");
            System.out.println(ex);
        }

    }

    public static void delete(Funcionario f) {
        Connection con = ModelConnect.getConectar();
        String sql = "DELETE FROM funcionario WHERE id_funcionario = ?";

        int opcao = JOptionPane.showConfirmDialog(null, "Deseja excluir o usuário " + f.getNome()
                + "?", "Excluir", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            try (PreparedStatement smt = con.prepareStatement(sql)) {
                smt.setInt(1, f.getId());
                smt.executeUpdate();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir.");
            }

        }

    }

    public static List<Funcionario> selectByLike(String s) {
        Connection con = ModelConnect.getConectar();
        List<Funcionario> list = new ArrayList<>();
        String sql = "SELECT * FROM funcionario AS f "
                + "INNER JOIN profissao AS p "
                + "ON f.id_profissao = p.id_profissao "
                + "WHERE f.fun_nome like ?";

        try (PreparedStatement smt = con.prepareStatement(sql)) {
            smt.setString(1, s + "%");
            ResultSet result = smt.executeQuery();
            while (result.next()) {
                Funcionario f = new Funcionario();
                f.setId(result.getInt("f.id_funcionario"));
                f.setNome(result.getString("f.fun_nome"));
                f.setCpf(result.getString("f.fun_cpf"));
                f.setSexo(result.getString("f.fun_sexo").charAt(0));
                f.setTelefone(result.getString("f.fun_telefone"));
                f.setEmail(result.getString("f.fun_email"));
                f.setEndereco(result.getString("f.fun_endereco"));
                f.setBairro(result.getString("f.fun_bairro"));
                f.setCep(result.getString("f.fun_cep"));
                f.setCidade(result.getString("f.fun_cidade"));
                f.setProfissao(result.getString("p.prof_descricao"));
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

    public static Funcionario selectById(String s) {
        Connection con = ModelConnect.getConectar();
        String sql = "SELECT * FROM funcionario AS f "
                + "INNER JOIN profissao AS p "
                + "ON f.id_profissao = p.id_profissao "
                + "WHERE f.id_funcionario = ?";

        Funcionario f = new Funcionario();

        try (PreparedStatement smt = con.prepareStatement(sql)) {
            smt.setString(1, s);

            ResultSet result = smt.executeQuery();
            result.next();
            f.setId(result.getInt("f.id_funcionario"));
            f.setNome(result.getString("f.fun_nome"));
            f.setCpf(result.getString("f.fun_cpf"));
            f.setSexo(result.getString("f.fun_sexo").charAt(0));
            f.setTelefone(result.getString("f.fun_telefone"));
            f.setEmail(result.getString("f.fun_email"));
            f.setEndereco(result.getString("f.fun_endereco"));
            f.setBairro(result.getString("f.fun_bairro"));
            f.setCep(result.getString("f.fun_cep"));
            f.setCidade(result.getString("f.fun_cidade"));
            f.setProfissao(result.getString("p.prof_descricao"));
            f.setId_profissao(result.getInt("p.id_profissao"));

            con.close();
            smt.close();

        } catch (Exception ex) {
            System.out.println(ex);
            f = null;
        }
        return f;
    }

    public static List<Funcionario> selectByFuncao(String s) {
        Connection con = ModelConnect.getConectar();
        List<Funcionario> list = new ArrayList<>();
        String sql = "SELECT * FROM funcionario AS f "
                + "INNER JOIN profissao AS p "
                + "ON f.id_profissao = p.id_profissao "
                + "INNER JOIN servico AS s "
                + "ON s.id_profissao = p.id_profissao "
                + "INNER JOIN funcao AS fc "
                + "ON fc.id_funcao = s.id_funcao "
                + "WHERE fc.func_descricao = ?";

        try (PreparedStatement smt = con.prepareStatement(sql)) {
            smt.setString(1, s);
            ResultSet result = smt.executeQuery();
            while (result.next()) {
                Funcionario f = new Funcionario();
                f.setId(result.getInt("f.id_funcionario"));
                f.setNome(result.getString("f.fun_nome"));
                f.setCpf(result.getString("f.fun_cpf"));
                f.setSexo(result.getString("f.fun_sexo").charAt(0));
                f.setTelefone(result.getString("f.fun_telefone"));
                f.setEmail(result.getString("f.fun_email"));
                f.setEndereco(result.getString("f.fun_endereco"));
                f.setBairro(result.getString("f.fun_bairro"));
                f.setCep(result.getString("f.fun_cep"));
                f.setCidade(result.getString("f.fun_cidade"));
                f.setProfissao(result.getString("p.prof_descricao"));
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

    public static Funcionario selectByName(String s) {
        Connection con = ModelConnect.getConectar();
        Funcionario f = new Funcionario();  
        String sql = "SELECT * FROM funcionario AS f "
                + "INNER JOIN profissao AS p "
                + "ON f.id_profissao = p.id_profissao "
                + "WHERE f.fun_nome = ?";

        try (PreparedStatement smt = con.prepareStatement(sql)) {
            smt.setString(1, s);
            ResultSet result = smt.executeQuery();
            result.next();
            
            f.setId(result.getInt("f.id_funcionario"));
            f.setNome(result.getString("f.fun_nome"));
            f.setCpf(result.getString("f.fun_cpf"));
            f.setSexo(result.getString("f.fun_sexo").charAt(0));
            f.setTelefone(result.getString("f.fun_telefone"));
            f.setEmail(result.getString("f.fun_email"));
            f.setEndereco(result.getString("f.fun_endereco"));
            f.setBairro(result.getString("f.fun_bairro"));
            f.setCep(result.getString("f.fun_cep"));
            f.setCidade(result.getString("f.fun_cidade"));
            f.setProfissao(result.getString("p.prof_descricao"));

            con.close();
            smt.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Nenhum registro encontrado.");
            System.out.println(ex);
        }

        return f;

    }

}
