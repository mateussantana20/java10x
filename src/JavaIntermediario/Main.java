package JavaIntermediario;

public class Main {
    public static void main(String[] args) {
        // Criar ninjas
        //Objeto 1
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome =  "Sasuke";
        Sasuke.sobrenome = "Uchiha";
        Sasuke.idade = 18;
        Sasuke.aldeia = "Konoha";
        Sasuke.ShariganAtivado();
        System.out.println(Sasuke.nome);

        //Objeto 2
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome =  "Naruto";
        Naruto.sobrenome = "Uzumaki";
        Naruto.idade = 18;
        Naruto.aldeia = "Konoha";
        Naruto.ModoSabioAtivado();
        System.out.println(Naruto.nome);


        //Obj 3
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata";
        Hinata.sobrenome = "Hyuga";
        Hinata.idade = 18;
        Hinata.BykuganAtivado();

        System.out.println("---------------------------");
        Boruto Boruto = new Boruto();
        Boruto.nome =  "Boruto";
        Boruto.idade = 11;
        Boruto.aldeia = "Konoha";
        Boruto.AtivarOKarma();




        //Aplicando metodos ao meus objetos
        String chamandoMetodo = Sasuke.EuSouUmNinja();
        System.out.println(chamandoMetodo);
        System.out.println(Sasuke.NomeCompleto());
        System.out.println(Sasuke.anosParaSeTornarHokage(30));

    }
}
