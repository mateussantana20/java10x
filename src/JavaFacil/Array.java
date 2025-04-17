package JavaFacil;

public class Array {
    public static void main(String[] args) {

        // Arrays sao tipos referencias
        /*
        Inicialização
        * Boolean = false
        * Sting = null
        * Int = 0
        * Double = 0.0
        *
        * */
        String[] ninjas = new String[4];

        ninjas[0] = "Naruto";
        ninjas[1] = "Hinata";
        ninjas[2] = "Boruto";
        ninjas[3] = "Kakashi";

        // Redeclarar o ARRAY
        ninjas = new String[6];
        System.out.println(ninjas[0]);



        for (int i = 0; i < ninjas.length; i++) {
            System.out.println(ninjas[i]);
        }

        int[] idade = new int[2];

        //Redeclarar
        String nomeNinja = "Naruto";
        nomeNinja = "Boruto";
        System.out.println(nomeNinja);



        ///  New array
        String[] hokages = new String[7];

    }
}
