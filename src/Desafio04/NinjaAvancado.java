package Desafio04;

public class NinjaAvancado implements  Ninja{
    String nome;
    int idade;
    String habilidade;
    String especialidade;


    public  NinjaAvancado () {}

    public NinjaAvancado (String nome, int idade, String habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
        mostrarInformacoes();
        executarHabilidade();
    }

    public void mostrarInformacoes () {
        System.out.println("Meu nome é " + nome + " Tenho " + idade + " anos " + "e minha habilidade é " + habilidade );
    }

    public void executarHabilidade () {
        System.out.println("Executei a habilidade especial " + especialidade);
    }


}
