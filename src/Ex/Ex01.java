package Ex;

public class Ex01 {
    public static void main(String[] args) {

        // Ninja 1
        String nomeNinja1 = "Naruto";
        int idadeNinja1  = 16;
        String missaoNinja1 = "Pegar o gato";
        char missaoNinja1Nivel = 'F';
        String statusMissaoNinja1 = "Em andamento";

        System.out.println(nomeNinja1);
        System.out.println(idadeNinja1);
        System.out.println(missaoNinja1Nivel);
        System.out.println(missaoNinja1);
        System.out.println(statusMissaoNinja1);

        if (idadeNinja1 >= 16) {
            statusMissaoNinja1 = "Concluido";
            System.out.println(nomeNinja1 + " Pode concluir a missao");
        } else {
            System.out.println(nomeNinja1 +  "Nao pode concluir a missao");
        }

        String nomeNinja2 = "Kakashi";
        int idadeNinja2  = 44;
        String missaoNinja2 = "Pegar informacoes da akatsuki";
        String missaoNinja1Nive2 = "Dificil";
        boolean statusMissaoNinja2 = false;


        String nomeNinja3 = "Sasuke";
        int idadeNinja3  = 16;
        String missaoNinja3 = "Escoltar um pedreiro";
        String missaoNinja1Nivel3 = "Media";
        boolean statusMissaoNinja3 = false;

    }
}
