package org.example;
import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pratos = {"Pizza", "Hambúrguer", "Batata", "Refrigerante"};
        double[] preços = {30.0, 20.0, 15.0, 8.0};

        char continuarPedido;
        double total = 0.0;
        int escolha;
        String pedidos = "";

        do {
            System.out.println("=== BEM VINDO AO RESTAURANTE ===");
            System.out.println("-- Cardápio --");

            for (int i = 0; i < pratos.length; i++) {
               System.out.println((i + 1) + "-" + pratos[i] + " - R$" + preços[i]);

            }

            System.out.println("Ecolha o pedido: ");
            escolha = scanner.nextInt();


            switch (escolha) {
                case 1:
                    total += preços[escolha - 1];
                    pedidos += pratos[escolha - 1] + ", " ;
                    System.out.println("Voçê escolheu: " + pratos[escolha - 1]);
                    break;
                case 2:
                    total += preços[escolha - 1];
                    pedidos += pratos[escolha - 1] + ", " ;
                    System.out.println("Voçê escolheu: " + pratos[escolha - 1]);
                    break;
                case 3:
                    total += preços[escolha - 1];
                    pedidos += pratos[escolha - 1] + ", " ;
                    System.out.println("Voçê escolheu: " + pratos[escolha - 1]);
                    break;
                case 4:
                    total += preços[escolha - 1];
                    pedidos += pratos[escolha - 1] + ", " ;
                    System.out.println("Voçê escolheu: " + pratos[escolha - 1]);
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente ");
            }

            System.out.println("Deseja adicionar mais algum item? s/n: ");
            continuarPedido = Character.toLowerCase(scanner.next().charAt(0));

            while (continuarPedido != 's' && continuarPedido != 'n') {
                System.out.println("Deseja continuar? s/n: ");
                continuarPedido = Character.toLowerCase(scanner.next().charAt(0));
            }
        } while (continuarPedido == 's');

        System.out.println("\n=== Pedido final ===");
        System.out.println("Itens: " + pedidos);
        System.out.println("Total: R$ " + total);
        System.out.println("Obrigado pela preferencia.");
        scanner.close();
    }
}
