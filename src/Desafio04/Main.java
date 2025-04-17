package Desafio04;

import JavaIntermediario.Uchiha;

public class Main {
    public static void main(String[] args) {
        NinjaBasico Sakura = new NinjaBasico();
        Sakura.nome = "Sakura";
        Sakura.idade = 15;
        Sakura.habilidade = "Cura";
        Sakura.executarHabilidade();

        NinjaAvancado Kakashi = new NinjaAvancado("Kakashi", 40, "Chidori", "Sharigan");
        NinjaAvancado Naruto = new NinjaAvancado("Naruto", 15, "Jutsu Clone das Sombras", "Rasengan");
        NinjaAvancado Sasuke = new NinjaAvancado("Sasuke", 16, "Jutsu de Fogo", "Mangekyou Sharigan");
    }
}
