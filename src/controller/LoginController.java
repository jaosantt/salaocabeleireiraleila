package controller;

import controller.helper.LoginHelper;
import model.Usuario;
import model.dao.UsuarioDAO;
import view.TelaCadastroUsuario;
import view.TelaLogin;
import view.TelaPrincipal;

public class LoginController{

    private final TelaLogin view;
    private final LoginHelper helper;
    
    public LoginController(TelaLogin view){
        this.view = view;    
        this.helper = new LoginHelper(view);
    }
    
    public void sistemaLogin(){
        
        //Coletar dados da view
        Usuario user =  helper.getUser();
        //Buscar no banco de dados
        Usuario userAuthenticated = UsuarioDAO.selectByUserPassword(user);
        
        if(userAuthenticated != null){
            TelaPrincipal menu = new TelaPrincipal();
            menu.setUser(userAuthenticated);
            menu.setVisible(true);
            view.dispose();
            
        }else{
            view.exibeMensagem("Usuario ou senha inválidos.");
        }
                        
        
    }
    
    public void abrirTelaCadastro(){
        TelaCadastroUsuario telaCadastroUsuario = new TelaCadastroUsuario();
        telaCadastroUsuario.setVisible(true);
    }
    
    
    public void testeFuncao(){
        System.out.println("Teste");
        
        this.view.exibeMensagem("Testando..");
    }
    
}