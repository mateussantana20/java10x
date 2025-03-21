package Condicoes;

public class ternario {
    public static void main(String[] args) {
        /* Ternarios: São maneiras de reduzir o codigo
        * variavel = {} ? valor verdadeiro : valorfalso;
        * */

        short numerosDeMissoes = 11;
        String nivel = (numerosDeMissoes >= 10) ? "Esse ninja esta com mais de 10 missoes" : "Esse ninja tem menos de 10 missoes ";
        System.out.println(nivel);
    }
}
