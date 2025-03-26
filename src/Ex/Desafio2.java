package Ex;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] ninjas = new String[3]; // Array de ninjas
        int opcao = 1;

        while (opcao != 0) {
        System.out.println("\n===== Menu Ninja =====");
        System.out.println("1. Cadastrar Ninja");
        System.out.println("2. Listar Ninjas");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");

        opcao = scanner.nextInt(); // Ler a opcao do usuario

        switch (opcao) {
            case 1:
                System.out.println("Cadastrar Ninja");
                System.out.println("Digite o nome do ninja");
                for (int i = 0; i < ninjas.length; i++) {
                    ninjas[i] = scanner.nextLine();
                }
                break;
            case 2:
                System.out.println("Listar Ninjas");
                for (int i = 0; i < ninjas.length; i++) {
                    System.out.println("Nome do Ninja " + ninjas[i]);
                }
                break;
            case 3:
                opcao = 0;
                System.out.println("Saindo, ate mais!!!!");
                break;
            default:
                System.out.println("Deu algum erro");
                opcao = 0;
                break;

            }
        }
        scanner.close();
    }

}
