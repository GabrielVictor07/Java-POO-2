package org.example;

public abstract class Camisa {
    // declara variaveis
    public String cor;
    public String tamanho;
    public double preco;
    public String estampa;

    public Camisa(){
        this.preco = preco;
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public abstract void exibirDetalhes();
    public abstract void calcularDesconto();
}
