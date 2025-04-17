package JavaFacil.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        /*
            Lacos de Repetição: Vão repetir infinitamente ou até atingir um paramentro desejado
            While
            For
        * */

        // While
        // while (condicao) {Tudo vai acontecer}

        // While
        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        while (numeroDeClones <= numeroMaximoDeClones) {
            numeroDeClones++;
            System.out.println(numeroDeClones + " O naruto fez um clone das sombras");
        }

        // For
        for (int i = 0; i <= numeroMaximoDeClones; i++) {
            System.out.println(i + " FOR: O naruto fez um clone das sombras");
        }

        }
}

