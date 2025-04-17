package JavaFacil.TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {
        /*
        * Dados primitivos - int, double, float, char, boolean, short
        * Objetivo da aula: Criar um Ninja -Naruto
        * */

        int idade  = 16; // Valor maximo 2147483647
        double altura = 1.66;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        Long saldoBancario = 99999999L; // Valor maximo 9,223372036854775807

        System.out.println(idade); // Comando para mostrar para o usuario
        System.out.println(saldoBancario);
        System.out.println(altura);
        System.out.println(inicial);
        System.out.println("Saldo Bancario é = " + saldoBancario);
        /*
        *
        int: Números inteiros.
        float: Números de ponto flutuante de precisão simples.
        double: Números de ponto flutuante de precisão dupla.
        char: Um único caractere.
        boolean: Valores verdadeiros ou falsos.
        byte: Números inteiros pequenos.
        short: Números inteiros menores que um int.
        Long: Números inteiros maiores que um int.
*/
    }

}
