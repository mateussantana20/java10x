package Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        /*
        * Scanner é um jeito de trazer o usuario para dentro da aplicacao
        * Objetivo: O usuario vai criar um ninja  vamos validar os dados
        *
        * */
        //Abrir o Scanner
        Scanner caixaDeTexto = new Scanner(System.in);

        // Receber o nome
        System.out.println("Escreva aqui o nome: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("Nome do ninja é: " + nomeDoNinja);

        // Receber a idade
        System.out.println("Escrava aqui a idade: ");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("Idade do ninja é: " + idadeDoNinja);

        // Tratamento de dados
        if (idadeDoNinja >= 18) {
            System.out.println("Esse ninja já é maior de idade");
        } else {
            System.out.println("É menor de idade");
        }


        // Fechar sempre o Scanner
        caixaDeTexto.close();

    }
}

