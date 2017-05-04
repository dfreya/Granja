
/**
 * Write a description of class granja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class granja
{

    /**
     * Constructor for objects of class granja
     */
    public granja()
    {
    }

    public void alimentar(Animal animal){
        animal.comer();
    }
    public void hacerEmitirSonidoCaracterístico(Animal animal){
         animal.emitirSonidoCaracteristico();
    }
    public void vacunar (Animal animal){
        animal.vacunar();
    }
}
