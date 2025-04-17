package Desafio04;

public class NinjaBasico implements Ninja {
    String nome;
    int idade;
    String habilidade;


    public void mostrarInformacoes () {
        System.out.println("Meu nome é " + nome + " Tenho " + idade + " anos ");
    }

    public void executarHabilidade () {
        System.out.println("Executei a habilidade " + habilidade);
    }
}
