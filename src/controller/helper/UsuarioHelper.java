package controller.helper;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Usuario;
import view.TelaGerenciarUsuarios;

public class UsuarioHelper{
    
    private final TelaGerenciarUsuarios view;

    public UsuarioHelper(TelaGerenciarUsuarios view) {
        this.view = view;
    }

    public void preencherTabela(List<Usuario> userLists) {
        
        DefaultTableModel dtm = (DefaultTableModel) view.getTbClientes().getModel();
        dtm.setNumRows(0);
        
        for(Usuario u : userLists){
            
            dtm.addRow(new Object[]{
                u.getId(),
                u.getNome(),
                u.getSexo(),
                u.getTelefone(),
                u.getEmail(),
                u.getCidade(),
            });
            
        }
        
    }
    
    public String getSearch(){
        
        String s = view.getTxvPesquisar().getText();
        
        return s;
        
    }
    
    public String getTabela(){
        int set = view.getTbClientes().getSelectedRow();
        String s = view.getTbClientes().getModel()
                .getValueAt(set,0).toString();
        
        return s;
    }
    
    public void setCampos(Usuario u){
        
        view.setId(u.getId());
        view.getTxvCliNome().setText(u.getNome());
        view.getTxvCliSexo().setText(Character.toString(u.getSexo()));
        view.getTxvCliTelefone().setText(u.getTelefone());
        view.getTxvCliEndereco().setText(u.getEndereco());
        view.getTxvCliBairro().setText(u.getBairro());
        view.getTxvCliCep().setText(u.getCep());
        view.getTxvCliCPF().setText(u.getCpf());
        view.getTxvCliCidade().setText(u.getCidade());
        view.getTxvCliEmail().setText(u.getEmail());
        
        
    }
    
    public Usuario getCampos(){
        
        Usuario u = new Usuario();
        u.setId(view.getId());
        u.setNome(view.getTxvCliNome().getText());
        u.setSexo(view.getTxvCliSexo().getText().charAt(0));
        u.setTelefone(view.getTxvCliTelefone().getText());
        u.setEndereco(view.getTxvCliEndereco().getText());
        u.setBairro(view.getTxvCliBairro().getText());
        u.setCep(view.getTxvCliCep().getText());
        u.setCpf(view.getTxvCliCPF().getText());
        u.setCidade(view.getTxvCliCidade().getText());
        u.setEmail(view.getTxvCliEmail().getText());
        
        return u;
    }
    
    
    
}