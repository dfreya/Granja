
/**
 * Write a description of class Pollo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pollo implements Animal
{
    private int puntosVida;
    private int peso;

    /**
     * Constructor for objects of class Pollo
     */
    public Pollo()
    {
        peso=PESOPOLLO;
        puntosVida=VIDA;
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

    public void vacunar(){
        puntosVida+=+10;
    }

    public void emitirSonidoCaracteristico(){
        System.out.println("Pio, pio");
    }
}
