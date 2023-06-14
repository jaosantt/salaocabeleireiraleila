
package controller.helper;

import model.Usuario;
import model.enums.StatusUsuario;
import view.TelaCadastroUsuario;

public class CadastroHelper {
    
    private final TelaCadastroUsuario view;

    public CadastroHelper(TelaCadastroUsuario view) {
        this.view = view;
    }
    
    public Usuario getUser(){
        String nome     = view.getTxvCliNome().getText();
        String cpf      = view.getTxvCliCPF().getText();
        Character sexo  = view.getCboSexo().getSelectedItem().toString().charAt(0);
        String telefone = view.getTxvCliTelefone().getText();
        String email    = view.getTxvCliEmail().getText();
        String endereco = view.getTxvCliEndereco().getText();
        String bairro   = view.getTxvCliBairro().getText();
        String cep      = view.getTxvCliCep().getText();
        String cidade   = view.getTxvCliCidade().getText();
        String usuario  = view.getTxvCliUsuario().getText();
        String senha    = view.getTxvCliSenha().getText();
        Usuario user    = new Usuario(0,0,usuario,senha,
                                      StatusUsuario.USER,nome,cpf,
                                      sexo,telefone,email,endereco,bairro,cep,cidade
                                     );
        return user;
    }
    
    public void clearScreen(){
        view.getTxvCliNome().setText("");
        view.getTxvCliCPF().setText("");
        view.getTxvCliTelefone().setText("");
        view.getTxvCliEmail().setText("");
        view.getTxvCliEndereco().setText("");
        view.getTxvCliBairro().setText("");
        view.getTxvCliCep().setText("");
        view.getTxvCliCidade().setText("");
        view.getTxvCliUsuario().setText("");
        view.getTxvCliSenha().setText("");
    }
    
}
