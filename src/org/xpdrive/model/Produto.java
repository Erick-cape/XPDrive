package org.xpdrive.model;

import org.xpdrive.dao.ProdutoDAO;

public class Produto {
    private String nome;
    private String tipo;
    private double valor;
    private int quantidade;

    public Produto () {
        this.nome = " ";
        this.tipo = " ";
        this.valor = 0.0d;
        this.quantidade = 0;
    }

    public Produto (String nome, String tipo, double valor, int quantidade) {
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
        this.quantidade = quantidade;
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantiade) {
        this.quantidade = quantiade;
    }

    public void inserir(String nome, String tipo, double valor, int quantidade) {
        ProdutoDAO pDAO = new ProdutoDAO();
    }

    public void alterar (int id, String valor) {
        ProdutoDAO pDAO = new ProdutoDAO();
    }

    public void alterar (int id, double valor) {
        ProdutoDAO pDAO = new ProdutoDAO();
    }

    public void alterar (int id, int valor) {
        ProdutoDAO pDAO = new ProdutoDAO();
    }

    public void excluir (int id) {
        ProdutoDAO pDAO = new ProdutoDAO();
    }

    public void listar (int id) {
        ProdutoDAO pDAO = new ProdutoDAO();
    }
}
