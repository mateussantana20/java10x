package JavaIn3;

public class Hokages {
    String nome;
    int idade;
    boolean vivoOuNao;


    public  Hokages () {}

    // Criar um construtor com argumento
    public Hokages (String nome) {
        this.nome = nome;
    }

    public Hokages (int idade) {
        this.idade = idade;
    }


    // All agrs construtor
    public Hokages (String nome, int idade, Boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }




}
