package Produto;

public class Produto {
    String nome;

    double preco;

    int quantidadeEmEstoque;

    public double calcularValorTotalEstoque(){
        return this.preco * this.quantidadeEmEstoque;

    }
}
