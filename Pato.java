
/**
 * Write a description of class Patos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pato implements Animal
{
    private int puntosVida;
    private int peso;

    /**
     * Constructor for objects of class Patos
     */
    public Pato()
    {
        peso=pesoPato;
        puntosVida=vida;
    }
    public int getPeso(){
        return peso;
    }
    public int getPuntosDeVida(){
        return puntosVida;
    }
    
    public void comer(){
        peso+=+1;
        puntosVida+=-10;
    }

    public void vacunar(){}

    public void emitirSonidoCaracteristico(){
        System.out.println("Cua, cua");
    }
}
