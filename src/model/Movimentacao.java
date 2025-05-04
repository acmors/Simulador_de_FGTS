package model;

import java.time.LocalDate;

public class Movimentacao {

    private int id;
    private String tipo;
    private double valor;
    private LocalDate data;
    private String descricao;
    private ContaFGTS contaFGTS;

    public Movimentacao() {
    }

    public Movimentacao(int id, String tipo, LocalDate data, double valor, String descricao, ContaFGTS contaFGTS) {
        this.id = id;
        this.tipo = tipo;
        this.data = data;
        this.valor = valor;
        this.descricao = descricao;
        this.contaFGTS = contaFGTS;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public ContaFGTS getContaFGTS() {
        return contaFGTS;
    }

    public void setContaFGTS(ContaFGTS contaFGTS) {
        this.contaFGTS = contaFGTS;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
