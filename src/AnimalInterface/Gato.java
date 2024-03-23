package AnimalInterface;

public class Gato implements Animal{
    @Override
    public void comer() {

    }

    @Override
    public void dormir() {

    }

    @Override
    public void emitirSom() {
        System.out.println("Miauuuu");
    }

    @Override
    public void definirRaca() {
        System.out.println("Gato Persa");
    }
}
