package model;

import model.enums.StatusUsuario;


public class Usuario extends Pessoas{
    
    protected int user;
    protected int id;
    protected String login;
    protected String password;
    private StatusUsuario status;

    public Usuario(int user, int id, String login, String password,StatusUsuario status, String nome,
            String cpf, char sexo, String telefone, String email, String endereco, 
            String bairro, String cep, String cidade) {
        super(nome, cpf, sexo, telefone, email, endereco, bairro, cep, cidade);
        this.user = user;
        this.id = id;
        this.login = login;
        this.password = password;
        this.status = status;
    }

    public Usuario(int user, String login, String password) {
        this.user = user;
        this.login = login;
        this.password = password;
    }

    public Usuario() {
    }
    
    

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public StatusUsuario getStatus() {
        return status;
    }

    public void setStatus(StatusUsuario status) {
        this.status = status;
    }


    

 

    
    
    
}