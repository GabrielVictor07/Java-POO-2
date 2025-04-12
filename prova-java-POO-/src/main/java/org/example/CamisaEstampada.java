package org.example;

public class CamisaEstampada extends Camisa {
        @Override
        public void exibirDetalhes() {
            preco = 500;
            cor = "Verde";
            tamanho = "PP";
            estampa = "Estampada";

            System.out.println("CAMISA ESTAMPADA");
            System.out.println("Preço: " + preco);
            System.out.println("Cor: " + cor);
            System.out.println("Tamanho: " + tamanho);
            System.out.println("Estampa: " + estampa);
        }

        public void calcularDesconto() {
            double desconto = preco - (preco * 0.05);
            System.out.println("Desconto: " + desconto);
        }
    };
