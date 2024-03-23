package AnimalInterface;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        cachorro.comer();
        cachorro.dormir();
        cachorro.emitirSom();
        //Criar uma Classe Gato
        //implementando a interface Animal
        gato.emitirSom();
        gato.comer();
        gato.dormir();
        gato.definirRaca();
    }
}
