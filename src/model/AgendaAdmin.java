
package model;


public class AgendaAdmin extends Agenda{
    
    private String data_adm;
    private String hora_adm;
    private String cliente;
    private String servico;
    private String funcionario;
    private String situacao;

    public AgendaAdmin(String data_adm, String hora_adm, String cliente, String servico, String funcionario, String situacao) {
        this.data_adm = data_adm;
        this.hora_adm = hora_adm;
        this.cliente = cliente;
        this.servico = servico;
        this.funcionario = funcionario;
        this.situacao = situacao;
    }

    
    
    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }
  

    public AgendaAdmin() {
    }

    public String getData_adm() {
        return data_adm;
    }

    public void setData_adm(String data_adm) {
        this.data_adm = data_adm;
    }

    public String getHora_adm() {
        return hora_adm;
    }

    public void setHora_adm(String hora_adm) {
        this.hora_adm = hora_adm;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    
    
    
}
