public class Main {


    public static void main(String[] args){


        Localizacao localizacao = new Amazonia();


        Inimigo inimigo = localizacao.criarInimigo();


        System.out.println(inimigo.atacar());


    }

}