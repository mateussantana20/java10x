package JavaFacil.Ex;

import java.util.Scanner;

public class Desafio02New {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] ninjas = new String[100];
        int totalNinjas = 0; // Contador para acompanhar quantos ninjas foram cadastrados
        boolean executando = true;

        System.out.println("Bem-vindo ao Sistema de Cadastro de Ninjas da Vila da Folha!");
        System.out.println("----------------------------------------------------------");

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
                    if (totalNinjas >= 100) {
                        System.out.println("Numero máximo de ninjas");
                    } else {
                        System.out.print("\nDigite o nome do ninja a ser cadastrado: ");
                        String nomeNinja = scanner.nextLine();
                        ninjas[totalNinjas] = nomeNinja;
                        totalNinjas++;
                        System.out.println("Ninja " + nomeNinja + " cadastrado com sucesso!");
                    }
                    break;
                case 2:
                    if (totalNinjas <= 0) {
                        System.out.println("\nNenhum ninja cadastrado ainda.");
                    } else {
                        System.out.println("\nListando Ninjas cadastrados.");
                        for (int i = 0; i < totalNinjas; i++) {
                            System.out.println("Nome " + (i + 1) + " : " + ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("\nSaindo, Ate mais!!!.");
                    executando = false;
                    break;

                default:
                    System.out.println("\nDigite 1,2 ou 3");
                    break;
            }


        }




    }
}
