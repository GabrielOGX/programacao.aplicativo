package Viagem;

public class Viagem {
    String destino;
    double distancia;
    double precoCombustivo;
    double consumoVeiculo;
    public void calcularCustoTotalViagem(){
        double litros = this.distancia/this.consumoVeiculo;
        double total = litros * this.precoCombustivo;
        System.out.println("Valor total da viagem = R$" + total);
    }
}
