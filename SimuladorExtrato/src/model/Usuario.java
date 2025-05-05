package model;

public class Usuario {
    private int id;
    private String nome;
    private String cpf;
    private String senha;
    private ContaFGTS contaFGTS;

    public Usuario(int id, String nome, String cpf, ContaFGTS contaFGTS, String senha) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.contaFGTS = contaFGTS;
    }

    public Usuario() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ContaFGTS getContaFGTS() {
        return contaFGTS;
    }

    public void setContaFGTS(ContaFGTS contaFGTS) {
        this.contaFGTS = contaFGTS;
    }
}
