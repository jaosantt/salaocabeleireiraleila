package model;

public class Funcionario extends Pessoas{
    protected int id;
    protected int id_profissao;
    protected String profissao;

    public Funcionario(int id, int id_profissao, String nome, String cpf, char sexo, String telefone, String email, String endereco, String bairro, String cep, String cidade) {
        super(nome, cpf, sexo, telefone, email, endereco, bairro, cep, cidade);
        this.id = id;
        this.id_profissao = id_profissao;
        
    }

    public Funcionario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_profissao() {
        return id_profissao;
    }

    public void setId_profissao(int id_profissao) {
        this.id_profissao = id_profissao;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    
   

  
    
}