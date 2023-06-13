
package controller.helper;

import model.Usuario;
import view.TelaLogin;

public class LoginHelper {
    
    private final TelaLogin view;
    

    public LoginHelper(TelaLogin view) {
        this.view = view;
        
    }
    
    public Usuario getUser(){
        String nome = view.getTxvLogin().getText();
        String senha = new String(view.getTxvSenha().getPassword());
        Usuario user = new Usuario(0, nome, senha);
        return user;
    }
    
    public void setUser(Usuario user){
        String nome = user.getLogin();
        String senha = user.getPassword();
        
        view.getTxvLogin().setText(nome);
        view.getTxvSenha().setText(senha);
    }
    
    public void clearScreen(){
        view.getTxvLogin().setText("");
        view.getTxvSenha().setText("");
    }
    
}
