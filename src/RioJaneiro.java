public class RioJaneiro extends Localizacao {


    @Override
    public Inimigo criarInimigo(){

        return new Criminoso("Criminoso");

    }

}