package model;

public class Servico {
    
    private int id;
    private int id_profissao;
    private int id_funcao;
    private Double valor;
    private Double tempo;

    public Servico(int id, int id_profissao, int id_funcao, Double valor, Double tempo) {
        this.id = id;
        this.id_profissao = id_profissao;
        this.id_funcao = id_funcao;
        this.valor = valor;
        this.tempo = tempo;
    }

    public Servico() {
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

    public int getId_funcao() {
        return id_funcao;
    }

    public void setId_funcao(int id_funcao) {
        this.id_funcao = id_funcao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getTempo() {
        return tempo;
    }

    public void setTempo(Double tempo) {
        this.tempo = tempo;
    }

    
 
   
    
    
}