package model;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Agenda{
    private int id;
    private Date data;
    private int id_cliente;
    private int id_situacao;
    private int id_servico;
    
    

    public Agenda(int id, String data, int id_cliente, int id_situacao, int id_servico) throws ParseException {
        this.id = id;
        this.data = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data);
        this.id_cliente = id_cliente;
        this.id_situacao = id_situacao;
        this.id_servico = id_servico;
        
    }

    public Agenda() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(String data) throws ParseException {
        this.data = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data);
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_situacao() {
        return id_situacao;
    }

    public void setId_situacao(int id_situacao) {
        this.id_situacao = id_situacao;
    }


    public int getId_servico() {
        return id_servico;
    }

    public void setId_servico(int id_servico) {
        this.id_servico = id_servico;
    }

    
           
    

}