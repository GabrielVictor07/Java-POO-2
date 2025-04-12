package org.example;

public class CamisaSimples extends Camisa {
    @Override
    public void exibirDetalhes() {
        preco = 200;
        cor = "Branco";
        tamanho = "M";

        System.out.println("CAMISA SIMPLES");
        System.out.println("Preço: " + preco);
        System.out.println("Cor: " + cor);
        System.out.println("Tamanho: " + tamanho);
    }

    public void calcularDesconto() {
        double desconto = preco - (preco * 0.1);
        System.out.println("Desconto: " + desconto);
        System.out.println("--------------------------------------------------");
    }
}
