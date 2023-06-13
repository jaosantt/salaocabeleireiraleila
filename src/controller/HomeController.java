package controller;

import controller.helper.HomeHelper;
import java.awt.Color;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import model.Agenda;
import model.Calendario;
import model.Funcao;
import model.Funcionario;
import model.Servico;
import model.Usuario;
import model.dao.AgendaDAO;
import model.dao.FuncionarioDAO;
import model.dao.ProfissaoDAO;
import model.dao.UsuarioDAO;
import view.TelaGerenciarAgendamentoAdmin;
import view.TelaGerenciarAgendamentos;
import view.TelaGerenciarFuncionarios;
import view.TelaGerenciarUsuarios;
import view.TelaPrincipal;

public class HomeController {

    private final TelaPrincipal view;
    private final HomeHelper helper;
    private Agenda agenda = new Agenda();

    public HomeController(TelaPrincipal view) {
        this.view = view;
        this.helper = new HomeHelper(view);
    }

    public void atualizarCliente() {
        //buscar dados no Bd
        List<Usuario> list = UsuarioDAO.read();

        //atualizar combo box
        helper.preencherUsuario(list);
    }
    
    public void abrirMeusAgendamentos(){
        TelaGerenciarAgendamentos agenda = new TelaGerenciarAgendamentos();
        agenda.setVisible(true);
        agenda.setUser_authenticated(view.getUser());
        view.dispose();
    }
    
    public void abrirGerenciarAgendamentos(){
        TelaGerenciarAgendamentoAdmin agenda = new TelaGerenciarAgendamentoAdmin();
        agenda.setVisible(true);
        agenda.setUser_authenticated(view.getUser());
        view.dispose();
    }
    
    public void abrirGerenciarFuncionarios(){
        TelaGerenciarFuncionarios funcionarios = new TelaGerenciarFuncionarios();
        funcionarios.setVisible(true);
        view.dispose();
    }
    
    public void abrirGerenciarUsuarios(){
        TelaGerenciarUsuarios usuarios = new TelaGerenciarUsuarios();
        usuarios.setVisible(true);
        view.dispose();
    }
    
    public void autenticacaoUsuario(){
        String tipo_usuario = String.valueOf(view.getUser().getStatus());
        int index = 0;
        
        if(tipo_usuario == "USER"){
            view.getCboUsuario().setVisible(false);
            view.getLblCliente().setVisible(false);
            view.getLbGerenciarAgendamentos().setEnabled(false);
            view.getLbGerenciarAgendamentos().setVisible(false);
            view.getLbGerenciarUsuarios().setEnabled(false);
            view.getLbGerenciarUsuarios().setVisible(false);
            view.getLbGerenciarFuncionarios().setEnabled(false);
            view.getLbGerenciarFuncionarios().setVisible(false);
            
            for(int i = 0; i < view.getUsers().size(); i++){
                if(view.getUsers().get(i).getLogin().equals(view.getUser().getLogin())){
                    index = i;
                    System.out.println(i);
                    System.out.println(view.getUsers().get(i).getLogin());
                }
            }
            view.getCboUsuario().setSelectedIndex(index);
        }else{
            view.getLbMeusAgendamentos().setEnabled(false);
            view.getLbMeusAgendamentos().setVisible(false);
        }
    
        
    }

    public void selecionarCabelo() {
        if (view.getTogCabelo().isSelected()) {
            //Desmarcar os outros botões
            helper.desmarcarAllCabelo();
            view.getTogCabelo().setBackground(Color.blue);
            //buscar dados no BD
            List<Funcao> funcaoList = new ArrayList<>();
            funcaoList = ProfissaoDAO.selectFuncaoById("1");

            //preencher servicos
            helper.preencherServico(funcaoList);
        }
    }

    public void selecionarBarba() {
        if (view.getTogBarba().isSelected()) {
            //Desmarcar os outros botões
            helper.desmarcarAllBarba();
            view.getTogBarba().setBackground(Color.blue);
            //buscar dados no BD
            List<Funcao> funcaoList = new ArrayList<>();
            funcaoList = ProfissaoDAO.selectFuncaoById("2");

            //preencher servicos
            helper.preencherServico(funcaoList);

        }
    }

    public void selecionarSombrancelha() {
        if (view.getTogSombracelha().isSelected()) {
            //Desmarcar os outros botões
            helper.desmarcarAllSombrancelha();
            view.getTogSombracelha().setBackground(Color.blue);
            //buscar dados no BD
            List<Funcao> funcaoList = new ArrayList<>();
            funcaoList = ProfissaoDAO.selectFuncaoById("3");

            //preencher servicos
            helper.preencherServico(funcaoList);
        }
    }

    public void selecionarMaoPe() {
        if (view.getTogMaoPe().isSelected()) {
            //Desmarcar os outros botões
            helper.desmarcarAllMaoPe();
            view.getTogMaoPe().setBackground(Color.blue);
            //buscar dados no BD
            List<Funcao> funcaoList = new ArrayList<>();
            funcaoList = ProfissaoDAO.selectFuncaoById("4");

            //preencher servicos
            helper.preencherServico(funcaoList);
        }
    }

    public void atualizarFuncionario() {
        //buscar na view

        String servico = helper.getServico();

        //buscar no banco de dados
        List<Funcionario> f = new ArrayList<>();
        f = FuncionarioDAO.selectByFuncao(servico);

        //preencher view
        helper.preencherFuncionario(f);

    }

    public void agendar(Calendario c) throws ParseException {
        //pegar na view
        int id_usuario = helper.getUsuario();

        String string_funcionario = helper.getFuncionario();

        String string_servico = helper.getServico();

        String dt = c.getDiaAltera() + "/" + String.format("%02d", c.getMesAltera() + 1) + "/" + c.getAnoAltera()
                + " " + this.helper.getHr();

        System.out.println(dt);

        //buscar no bd
        Funcionario f = FuncionarioDAO.selectByName(string_funcionario);

        Servico s = ProfissaoDAO.selectServico(string_servico, string_funcionario);

        //armazenar na variavel
        Agenda agenda;
        try {

            agenda = new Agenda(0, dt, id_usuario, 1, s.getId());
            AgendaDAO.create(agenda);
        } catch (ParseException ps) {
            JOptionPane.showMessageDialog(null, "Por favor selecione um horário", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    /// Controlar Calendário
    public void iniciaCalendario(Calendario c) {
        helper.setFormatoCalendario(c);
        helper.preencherAnoMes(c);
        helper.limparDias();
        c.setTotalDiasMes(helper.obterDiasPorMes(c));
        helper.alteraData(c);
        helper.setarDiasDoMes(c);
        helper.preencherDias(c);
    }

    public void alteraMes(Calendario c) {
        c.setDiaAltera(c.getDiaFixo());
        helper.limparDias();
        c.setTotalDiasMes(helper.obterDiasPorMes(c));
        helper.alteraData(c);
        helper.setarDiasDoMes(c);
        helper.preencherDias(c);

    }

    public void alteraAno(Calendario c) {
        c.setDiaAltera(c.getDiaFixo());
        helper.limparDias();
        c.setTotalDiasMes(helper.obterDiasPorMes(c));
        helper.alteraData(c);
        helper.setarDiasDoMes(c);
        helper.preencherDias(c);
    }

    public void alteraDia(Calendario c, JButton b) {

        helper.desmarcarAllButton();
        helper.alteraData(c);
        helper.setarDiasDoMes(c);
        helper.preencherDias(c);
        System.out.println("ano fixo:" + c.getAnoFixo() + " ano altera:" + c.getAnoAltera() + " mes fixo" + c.getMesFixo() + " mes altera:" + (c.getMesAltera() + 1) + " dia fixo:" + c.getDiaFixo() + " dia altera:" + Integer.parseInt(b.getText()));
        LocalDate data_atual = LocalDate.now();
        LocalDate data_selecionada = LocalDate.of(c.getAnoAltera(), c.getMesAltera()+1, Integer.parseInt(b.getText()));
        if (data_selecionada.isBefore(data_atual)){
            JOptionPane.showMessageDialog(view, "Selecione um dia válido.");
            
        } else {
            c.setDiaAltera(Integer.parseInt(b.getText()));
            b.setBackground(Color.blue);
            b.setForeground(Color.white);
        }

    }

    public void Horas(JToggleButton btn) {
        helper.desmarcarAllHoras();
        helper.getHoras(btn);
        
        

    }

}
