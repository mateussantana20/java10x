package JavaFacil.TiposDeDados;

public class DadosNaoPrimitivo {
    public static void main(String[] args) {
        //Tudo que for digitado aqui dntro com o comando PSVM vai ser compilado pelo java

        /*
        * Dados não primitivos: String, JavaFacil.Array, Class, enum
        * Objetivos: Criar um ninja, e atribuir um metodo a ele
        * */

        String nome = "Xaruto Uzukrak";
        String NomeEmCaixaAlta =nome.toUpperCase(); // Colocar tudo vem CAPSLOCK
        System.out.println("Esse texto está em CAPSLOCK " + NomeEmCaixaAlta);
        System.out.println("Esse texto está normal " + nome);


        String aldeia = "Aldeia da Folha";
        String stringEmCaixaBaixa = aldeia.toLowerCase(); //// Colocar tudo vem Minusculo
        System.out.println(stringEmCaixaBaixa);

        /*
        Dados Não Primitivos Abordados
        Strings: Texto e manipulação de cadeias de caracteres.
        Arrays: Estruturas para armazenar múltiplos valores em uma única variável.
        JavaFacil.Objetos: Instâncias de classes que encapsulam dados e comportamentos.
        * */
    }
}
