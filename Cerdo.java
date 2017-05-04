
/**
 * Write a description of class Cerdos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cerdo implements Animal
{
    private int puntosVida;
    private int peso;
    
    /**
     * Constructor for objects of class Cerdos
     */
    public Cerdo()
    {
        peso=PESOCERDO;
        puntosVida=VIDA;
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
        puntosVida+=+20;
    }

    public void emitirSonidoCaracteristico(){
        System.out.println("Ñoinq, ñoinq");
    }
}
