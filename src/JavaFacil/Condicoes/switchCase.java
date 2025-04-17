package JavaFacil.Condicoes;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {


        /*
        * SwitchCase: Que servem para gerar casos especificos:
        * Objetivo:Pedir pro usuario escolher entre os Ninjas
        *
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um personagem:");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        // Pedir para o usurio escolher uma
        int escolhaDoUsuario = scanner.nextInt();
        System.out.println("Voce digitou o numero: " + escolhaDoUsuario);

        // Reacao ao escolher um personagm
        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("O usurio escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("O usurio escolheu o Sasuke Uchiha");
                break;
            case 3:
                System.out.println("O usurio escolheu o Sakura Haruno");
                break;
            default:
                System.out.println("Deu algum erro");
                break;

        }

        scanner.close();
    }
}
