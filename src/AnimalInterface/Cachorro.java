package AnimalInterface;

public class Cachorro implements Animal{
    @Override
    public void comer() {
        System.out.println("Comendo.");
    }

    @Override
    public void dormir() {
        System.out.println("Dormindo.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Auauauau!");
    }
}
