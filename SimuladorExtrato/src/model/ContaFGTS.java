package model;

public class ContaFGTS {

    private int id;
    private String numeroConta;
    private double saldo;
    private Usuario usuario;

    public ContaFGTS() {
    }

    public ContaFGTS(int id, double saldo, String numeroConta, Usuario usuario) {
        this.id = id;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
