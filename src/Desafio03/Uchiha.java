package Desafio03;

public class Uchiha extends Ninja {
    String habilidadeEspecial;

    @Override
    public void mostrarInfomacoes() {
        super.mostrarInfomacoes();
        mostrarHabilidadeEspecial();
    }

    public void mostrarHabilidadeEspecial() {
        System.out.println("Habilidade Especial = " + habilidadeEspecial);
    }
}
