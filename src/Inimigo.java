
public abstract class Inimigo {


    protected String nome;
    protected int vida;
    protected int dano;


    public abstract String atacar();


    public String getNome(){

        return nome;

    }


    public int getVida(){

        return vida;

    }


    public int getDano(){

        return dano;

    }

}