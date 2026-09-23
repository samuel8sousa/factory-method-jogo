public class Cangaceiro extends Inimigo {


    public Cangaceiro(String nome){

        this.nome = nome;
        vida = 100;
        dano = 5;

    }


    @Override
    public String atacar(){

        return "CANGACEIRO METE A PEIXEIRA";

    }

}