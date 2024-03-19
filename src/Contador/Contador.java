package Contador;

public class Contador {
    int valor;
    public void incrementar(){
        this.valor++;
    }
    public void decrementar(){
        this.valor--;
    }
    public void exibirValorAtual(){
        System.out.println("O valor atual é: " + this.valor);
    }
}
