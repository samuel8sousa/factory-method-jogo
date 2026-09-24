public class Main {


    public static void main(String[] args){


        Localizacao localizacao = new Amazonia();


        Inimigo inimigo = localizacao.criarInimigo();


        System.out.println(inimigo.atacar());
        System.out.println("Nome: " + inimigo.getNome());
        System.out.println("Vida: " + inimigo.getVida());
        System.out.println("Dano: " + inimigo.getDano());
        System.out.println("Ataque: " + inimigo.atacar());


    }

}