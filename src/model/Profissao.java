package model;

public class Profissao {
    
    private int id;
    private String descricao;

    public Profissao(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Profissao() {
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}
