package Viagem;

public class Viagem {
    //destino, distancia e precoCombustivel
    String destino;
    double distancia;
    double precoCombustivel;
    double consumoVeiculo;
    public void calcularCustoTotalViagem(){
        double litros = this.distancia/this.consumoVeiculo;
        double total = litros * this.precoCombustivel;
        System.out.println("Valor total da Viagem = R$"+total);
    }
}
