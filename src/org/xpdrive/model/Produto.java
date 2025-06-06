package org.xpdrive.model;

public class Produto {
    private String nome;
    private String tipo;
    private double valor;
    private short quantiade;

    public Produto () {
        this.nome = " ";
        this.tipo = " ";
        this.valor = 0.0d;
        this.quantiade = 0;
    }

    public Produto (String nome, String tipo, double valor, short quantidade) {
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
        this.quantiade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public short getQuantiade() {
        return quantiade;
    }

    public void setQuantiade(short quantiade) {
        this.quantiade = quantiade;
    }
}
