package controller;

import controller.helper.FuncionarioHelper;
import java.util.ArrayList;
import java.util.List;
import model.Funcionario;
import model.Profissao;
import model.dao.FuncionarioDAO;
import model.dao.ProfissaoDAO;
import view.TelaGerenciarAgendamentoAdmin;
import view.TelaGerenciarAgendamentos;
import view.TelaGerenciarFuncionarios;
import view.TelaGerenciarUsuarios;
import view.TelaPrincipal;

public class FuncionarioController {

    private final TelaGerenciarFuncionarios view;
    private final FuncionarioHelper helper;

    public FuncionarioController(TelaGerenciarFuncionarios view) {
        this.view = view;
        this.helper = new FuncionarioHelper(view);
    }

    public void sistemaCadastro() {
        Funcionario f = helper.getFuncionario();

        f.setId_profissao(helper.getProfissao() + 1);

        FuncionarioDAO.create(f);

        helper.clearScreen();
    }

    public void abrirMenuPrincipal() {
        TelaPrincipal principal = new TelaPrincipal();
        principal.setVisible(true);
        principal.setUser(view.getUser_authenticated());
        view.dispose();
    }

    public void abrirMeusAgendamentos() {
        TelaGerenciarAgendamentos agenda = new TelaGerenciarAgendamentos();
        agenda.setVisible(true);
        agenda.setUser_authenticated(view.getUser_authenticated());
        view.dispose();
    }

    public void abrirGerenciarAgendamentos() {
        TelaGerenciarAgendamentoAdmin agenda = new TelaGerenciarAgendamentoAdmin();
        agenda.setVisible(true);
        agenda.setUser_authenticated(view.getUser_authenticated());
        view.dispose();
    }

    public void abrirGerenciarFuncionarios() {
        TelaGerenciarFuncionarios funcionarios = new TelaGerenciarFuncionarios();
        funcionarios.setVisible(true);
        view.dispose();
    }

    public void abrirGerenciarUsuarios() {
        TelaGerenciarUsuarios usuarios = new TelaGerenciarUsuarios();
        usuarios.setVisible(true);
        view.dispose();
    }

    public void atualizaProfissao() {
        //Buscar dados no BD
        List<Profissao> list = ProfissaoDAO.read();

        //atualizar combo box
        helper.preencherProfissao(list);

    }

    public void atualizaTabela() {
        //pegar dados do banco de dados
        List<Funcionario> funcList = new ArrayList<>();
        funcList = FuncionarioDAO.read();

        //preencher view
        helper.preencherTabela(funcList);
    }

    public void campoPesquisa() {
        //pegar dados da view
        String s = helper.getSearch();

        //pegar dados do BD
        List<Funcionario> funcList = new ArrayList<>();
        funcList = FuncionarioDAO.selectByLike(s);

        //preencher view
        helper.preencherTabela(funcList);
    }

    public void setarCampos() {
        //pegar o ID da view
        String s = helper.getTabela();

        //pegar dados do bd
        Funcionario f = new Funcionario();
        f = FuncionarioDAO.selectById(s);

        //preencher campos
        helper.setCampos(f);
    }

    public void updateTabela() {

        //pegar dados do view
        Funcionario f = helper.getCampos();

        //Alterar dados
        FuncionarioDAO.update(f);

        //atualizar tabela
        this.atualizaTabela();
    }

    public void removerTabela() {

        //pegar dados do view
        Funcionario f = helper.getCampos();

        //remover dados
        FuncionarioDAO.delete(f);

        //atualizar tabela
        this.atualizaTabela();

    }

}
