package controller;

import controller.helper.UsuarioHelper;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Usuario;
import model.dao.UsuarioDAO;
import view.TelaGerenciarAgendamentoAdmin;
import view.TelaGerenciarAgendamentos;
import view.TelaGerenciarFuncionarios;
import view.TelaGerenciarUsuarios;
import view.TelaPrincipal;


public class UsuarioController{
    
    private final TelaGerenciarUsuarios view;
    private final UsuarioHelper helper;
    
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

    public UsuarioController(TelaGerenciarUsuarios view) {
        this.view = view;
        this.helper = new UsuarioHelper(view);
    }
    
    public void atualizarTabela(){ 
        //pegar dados do banco de dados
        List<Usuario> userLists = new ArrayList<>();
        userLists = UsuarioDAO.read();
        
        //preencher view
        helper.preencherTabela(userLists); 
    }
    
    public void campoPesquisa(){
        
        //pegar dados da view
        String s = helper.getSearch();
        
        //pegar dados do BD
        List<Usuario> userLists = new ArrayList<>();
        userLists = UsuarioDAO.selectByLike(s);
        
        //preencher view
        helper.preencherTabela(userLists);
        
    }
    
    public void setarCampos(){
        
        //pegar o ID  da view
        String s = helper.getTabela();
        
        //pegar dados do BD
        Usuario u = new Usuario();
        u = UsuarioDAO.selectById(s);
        
        //preencher campos
        helper.setCampos(u);
        
    }
    
    public void updateTabela(){
               
        //pegar dados do view
        Usuario u = helper.getCampos();
        
        //alterar dados
        UsuarioDAO.update(u);
        
        //atualizar tabela
        this.atualizarTabela();
       
              
        
    }
    
    public void removerTabela(){
        
        //pegar dados do view
        Usuario u = helper.getCampos();
        
        //remover dados
        UsuarioDAO.delete(u);
        
        //atualizar tabela
        this.atualizarTabela();
    }
    
    
}