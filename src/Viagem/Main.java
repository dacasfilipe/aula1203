package Viagem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Viagem viagem = new Viagem();
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o destino:");
        viagem.destino = leia.next();
        System.out.println("Informe a Distância:");
        viagem.distancia = leia.nextDouble();
        System.out.println("Preço do Combustível:");
        viagem.precoCombustivel = leia.nextDouble();
        System.out.println("Consumo de Veiculo(km/litro):");
        viagem.consumoVeiculo = leia.nextDouble();
        viagem.calcularCustoTotalViagem();
    }
}
