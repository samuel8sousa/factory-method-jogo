public class AnimalMutante extends Inimigo {


    public AnimalMutante(String nome){

        this.nome = nome;
        vida = 100;
        dano = 5;

    }


    @Override
    public String atacar(){

        return "ANIMAL DAR UMA MORDIDA";

    }

}