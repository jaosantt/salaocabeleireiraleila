package controller;

import controller.helper.AgendaHelper;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.AgendaAdmin;
import model.dao.AgendaDAO;
import view.TelaGerenciarAgendamentoAdmin;
import view.TelaGerenciarAgendamentos;
import view.TelaGerenciarFuncionarios;
import view.TelaGerenciarUsuarios;
import view.TelaPrincipal;
import view.sub.TelaReagendamento;

public class AgendaController {

    private final TelaGerenciarAgendamentoAdmin view;
    private AgendaHelper helper;

    public AgendaController(TelaGerenciarAgendamentoAdmin view) {
        this.view = view;
        this.helper = new AgendaHelper(view);

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

    public void atualizaTabela() {

        //pegar dados do banco de dados
        List<AgendaAdmin> agenda = new ArrayList<>();
        agenda = AgendaDAO.readAdmin();

        //preencher view
        helper.preencherTabela(agenda);

    }

    public void confirmaAgendamento() throws ParseException {
        //pegar dados da view
        String data = helper.getTabelaData();
        String hora = helper.getTabelaHora();

        int resposta = JOptionPane.showConfirmDialog(
                null,
                "Deseja confirmar o agendamento?",
                "Confirmar",
                JOptionPane.YES_NO_OPTION
        );

        if (resposta == JOptionPane.YES_OPTION) {
            AgendaDAO.updateSituacao(2, data, hora);
        }

        atualizaTabela();

    }

    public void marcarComoFeito() throws ParseException {
        //pegar dados da view
        String data = helper.getTabelaData();
        String hora = helper.getTabelaHora();

        int resposta = JOptionPane.showConfirmDialog(
                null,
                "Deseja marcar o serviço como FEITO?",
                "Concluir",
                JOptionPane.YES_NO_OPTION
        );

        if (resposta == JOptionPane.YES_OPTION) {
            AgendaDAO.updateSituacao(3, data, hora);
        }

        atualizaTabela();

    }

    public void cancelarAgendamento() throws ParseException {
        //pegar dados da view
        String data = helper.getTabelaData();
        String hora = helper.getTabelaHora();

        int resposta = JOptionPane.showConfirmDialog(
                null,
                "Deseja cancelar o agendamento?",
                "Cancelar",
                JOptionPane.YES_NO_OPTION
        );

        if (resposta == JOptionPane.YES_OPTION) {
            AgendaDAO.updateSituacao(4, data, hora);
        }

        atualizaTabela();

    }

    public void abrirSubview() {

        //abrir reagendamento
        TelaReagendamento subview = new TelaReagendamento();
        subview.setData_antiga(helper.getTabelaData());
        subview.setHora_antiga(helper.getTabelaHora());
        subview.setVisible(true);

    }

}
