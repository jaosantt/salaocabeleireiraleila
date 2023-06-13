package model;

public class Funcao extends Profissao{
    
   private int id_tratamento;
   private String tratamento;

    public Funcao(int id_tratamento, String tratamento, int id, String descricao) {
        super(id, descricao);
        this.id_tratamento = id_tratamento;
        this.tratamento = tratamento;
    }

    public Funcao(int id_tratamento, String tratamento) {
        this.id_tratamento = id_tratamento;
        this.tratamento = tratamento;
    }

    public Funcao() {
    }

    public int getId_tratamento() {
        return id_tratamento;
    }

    public void setId_tratamento(int id_tratamento) {
        this.id_tratamento = id_tratamento;
    }

    public String getTratamento() {
        return tratamento;
    }

    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }
   
   
   
    
}