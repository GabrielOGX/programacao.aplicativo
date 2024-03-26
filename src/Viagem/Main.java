package Viagem;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Viagem viagem = new Viagem();
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o destino: ");
        viagem.destino = leia.next();
        System.out.println("Informe a Distancia: ");
        viagem.distancia = leia.nextDouble();
        System.out.println("Preço do Combustivel: ");
        viagem.precoCombustivo = leia.nextDouble();
        System.out.println("Consumo de Veiculo(Km/litro): ");
        viagem.consumoVeiculo = leia.nextDouble();
        viagem.calcularCustoTotalViagem();
    }
}
