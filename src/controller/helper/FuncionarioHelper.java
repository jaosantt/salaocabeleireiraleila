package controller.helper;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.Funcionario;
import model.Profissao;
import view.TelaGerenciarFuncionarios;

public class FuncionarioHelper {

    private final TelaGerenciarFuncionarios view;

    public FuncionarioHelper(TelaGerenciarFuncionarios view) {
        this.view = view;
    }

    public Funcionario getFuncionario() {
        String nome = view.getTxvFunNome().getText();
        String cpf = view.getTxvFunCpf().getText();
        Character sexo = view.getCboSexoF().getSelectedItem().toString().charAt(0);
        String telefone = view.getTxvFunTelefone().getText();
        String email = view.getTxvFunEmail().getText();
        String endereco = view.getTxvFunEndereco().getText();
        String bairro = view.getTxvFunBairro().getText();
        String cep = view.getTxvFunCep().getText();
        String cidade = view.getTxvFunCidade().getText();
        Funcionario f = new Funcionario(0, 0, nome, cpf, sexo, telefone, email, endereco,
                bairro, cep, cidade);
        return f;
    }

    public void clearScreen() {
        view.getTxvFunNome().setText("");
        view.getTxvFunCpf().setText("");
        view.getTxvFunTelefone().setText("");
        view.getTxvFunEmail().setText("");
        view.getTxvFunEndereco().setText("");
        view.getTxvFunBairro().setText("");
        view.getTxvFunCep().setText("");
        view.getTxvFunCidade().setText("");

    }

    public void preencherProfissao(List<Profissao> list) {

        DefaultComboBoxModel cbModel = (DefaultComboBoxModel) view.getCbProfissao().getModel();

        for (Profissao profissao : list) {
            cbModel.addElement(profissao.getDescricao());
        }

    }

    public int getProfissao() {
        return view.getCbProfissao().getSelectedIndex();
    }

    public void preencherTabela(List<Funcionario> funcLists) {
        DefaultTableModel dtm = (DefaultTableModel) view.getTbFuncionario().getModel();
        dtm.setNumRows(0);
            
        for (Funcionario f : funcLists) {
            dtm.addRow(new Object[]{
                f.getId(),
                f.getNome(),
                f.getCpf(),
                f.getProfissao(),
                f.getTelefone(),
                f.getEmail(),
                f.getCidade()
            });

        }
    }

    public String getSearch() {

        String s = view.getTxvPesquisar().getText();

        return s;

    }

    public String getTabela() {
        int set = view.getTbFuncionario().getSelectedRow();
        String s = view.getTbFuncionario().getModel()
                .getValueAt(set, 0).toString();
        return s;
    }
    
    public void setCampos(Funcionario f){
        view.setId(f.getId());
        view.getTxvFunNome().setText(f.getNome());
        if(f.getSexo() == 'M'){
            view.getCboSexoF().setSelectedIndex(0);
        }else{
            view.getCboSexoF().setSelectedIndex(1);
        }
        view.getTxvFunTelefone().setText(f.getTelefone());
        view.getTxvFunEndereco().setText(f.getEndereco());
        view.getTxvFunBairro().setText(f.getBairro());
        view.getTxvFunCep().setText(f.getCep());
        view.getTxvFunCpf().setText(f.getCpf());
        view.getTxvFunCidade().setText(f.getCidade());
        view.getTxvFunEmail().setText(f.getEmail());
        view.getCbProfissao().setSelectedIndex(f.getId_profissao()-1);
        
    }
    
       public Funcionario getCampos(){
        
        Funcionario f = new Funcionario();
        f.setId(view.getId());
        f.setNome(view.getTxvFunNome().getText());
        f.setSexo(view.getCboSexoF().getSelectedItem().toString().charAt(0));
        f.setTelefone(view.getTxvFunTelefone().getText());
        f.setEndereco(view.getTxvFunEndereco().getText());
        f.setBairro(view.getTxvFunBairro().getText());
        f.setCep(view.getTxvFunCep().getText());
        f.setCpf(view.getTxvFunCpf().getText());
        f.setCidade(view.getTxvFunCidade().getText());
        f.setEmail(view.getTxvFunEmail().getText());
        f.setId_profissao(getProfissao()+1);
        
        return f;
    }

}
