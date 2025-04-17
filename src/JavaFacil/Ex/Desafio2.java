package JavaFacil.Ex;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX_NINJAS = 100; // Define um limite máximo de ninjas
        String[] ninjas = new String[MAX_NINJAS];
        int totalNinjas = 0; // Contador para acompanhar quantos ninjas foram cadastrados

        System.out.println("Bem-vindo ao Sistema de Cadastro de Ninjas da Vila da Folha!");
        System.out.println("----------------------------------------------------------");

        boolean executando = true;

        while (executando) {
            System.out.println("\nMenu:");
            System.out.println("1 - Cadastrar novo ninja");
            System.out.println("2 - Listar todos os ninjas cadastrados");
            System.out.println("3 - Sair do sistema");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    if (totalNinjas >= MAX_NINJAS) {
                        System.out.println("\nLimite máximo de " + MAX_NINJAS + " ninjas atingido!");
                    } else {
                        System.out.print("\nDigite o nome do ninja a ser cadastrado: ");
                        String nomeNinja = scanner.nextLine();
                        ninjas[totalNinjas] = nomeNinja;
                        totalNinjas++;
                        System.out.println("Ninja " + nomeNinja + " cadastrado com sucesso!");
                    }
                    break;

                case 2:
                    if (totalNinjas == 0) {
                        System.out.println("\nNenhum ninja cadastrado ainda.");
                    } else {
                        System.out.println("\nLista de Ninjas da Vila da Folha:");
                        System.out.println("-------------------------------");
                        for (int i = 0; i < totalNinjas; i++) {
                            System.out.println((i + 1) + ". " + ninjas[i]);
                        }
                    }
                    break;

                case 3:
                    executando = false;
                    System.out.println("\nEncerrando o sistema. Até logo!");
                    break;

                default:
                    System.out.println("\nOpção inválida. Por favor, escolha 1, 2 ou 3.");
            }
        }

        scanner.close();
    }

}
