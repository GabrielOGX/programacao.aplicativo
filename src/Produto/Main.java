package Produto;

public class Main {
    public static void main(String[] args) {
        Produto arroz = new Produto();
            arroz.nome = "Fumacense";
            arroz.preco = 4.50;
            arroz.quantidadeEmEstoque = 3;
        System.out.println("Valor total estoque: " + arroz.calcularValorTotalEstoque());

    }
}
