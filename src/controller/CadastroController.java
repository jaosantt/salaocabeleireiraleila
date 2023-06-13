package controller;

import controller.helper.CadastroHelper;
import model.Usuario;
import model.dao.UsuarioDAO;
import view.TelaCadastroUsuario;

public class CadastroController {
    
    private final TelaCadastroUsuario view;
    private final CadastroHelper helper;
    
    public CadastroController(TelaCadastroUsuario view){
        this.view = view;
        this.helper = new CadastroHelper(view);
    }
    
    public void sistemaCadastro(){
        
        //coletar dados da view
        Usuario user = helper.getUser();
        //fazer o insert
        UsuarioDAO.create(user);
        
    }
    
    
    
}
