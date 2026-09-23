public class Criminoso extends Inimigo {


    public Criminoso(String nome){

        this.nome = nome;
        vida = 80;
        dano = 15;

    }


    @Override
    public String atacar(){

        return "CRIMINOSO ATACA COM ARMA";

    }

}