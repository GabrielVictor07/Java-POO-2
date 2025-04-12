package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Camisa camisa1 = new CamisaSimples() {
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

            @Override
            public void calcularDesconto() {
                double desconto = preco - (preco * 0.1);
                System.out.println("Desconto: " + desconto);
                System.out.println("--------------------------------------------------");
            }
        };
        Camisa camisa2 = new CamisaEstampada() {
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

            @Override
            public void calcularDesconto() {
                double desconto = preco - (preco * 0.05);
                System.out.println("Desconto: " + desconto);
            }
        };
        camisa1.exibirDetalhes();
        camisa1.calcularDesconto();

        camisa2.exibirDetalhes();
        camisa2.calcularDesconto();
    }
}
