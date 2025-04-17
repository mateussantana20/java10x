package JavaIntermediario;

public class Ninja {

    String nome;
    String sobrenome;
    String aldeia;
    int idade;

    // Criar um metodo Publico personalizado
    // Void nao retorna nada


    /*Metodo String vai ter que retornar uma String*/
    public String EuSouUmNinja() {
        return "Oi, Eu sou um ninja!!";
    }

    public String NomeCompleto () {
        return nome + " " + sobrenome;
    }

    public int anosParaSeTornarHokage (int idadeMinimaParaSerHokage) {
        return idadeMinimaParaSerHokage - idade;
    }
}
