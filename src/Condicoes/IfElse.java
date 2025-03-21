package Condicoes;

public class IfElse {
    public static void main(String[] args) {

        /* IF e ELSE - Condicoes
        else if
        * Objetivo: Passar o ninja de nivel de acordo com o numero de missoes
        * */

        // Ninja
        String nome = "Naruto Uzumaki";
        String rank;

        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 20;


        // se {condicao} faca isso
        if (numeroDeMissoes == 10 && idade > 15) {
            System.out.println(nome + " Rank: Chunnin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println(nome + " Rank: Jounin");
        }
        else {
            System.out.println(nome + " Rank: Gennin");
        }

    }
}
