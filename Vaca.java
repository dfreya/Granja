
/**
 * Write a description of class Vacas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vaca implements Animal
{
    private int puntosVida;
    private int peso;

    /**
     * Constructor for objects of class Vacas
     */
    public Vaca()
    {
        peso=pesoVaca;
        puntosVida=vida;
    }

    public int getPeso(){
        return peso;
    }

    public int getPuntosDeVida(){
        return puntosVida;
    }

    public void comer(){
        peso+=+2;
        puntosVida+=-10;
    }

    public void vacunar(){
        puntosVida+=+30;
    }

    public void emitirSonidoCaracteristico(){
        System.out.println("Muuu, muuuu");
    }
}
