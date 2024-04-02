package ContaBancariaV2;
import Pessoa.Pessoa;
public class ContaBancariaV2 {
    private int numero;
    private double saldo;
    private Pessoa titular; //titular.nome titular.cpf titular.idade

    public ContaBancariaV2(int numero, Pessoa titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public double getSaldo() {return saldo;}

    public void setSaldo(double saldo) {this.saldo = saldo;}

    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }
    public void sacar(double valor){
        if(saldo>0 && saldo>=valor){
            this.saldo = this.saldo - valor;
            System.out.println("Novo saldo: " + this.saldo);
        }else{
            System.out.println("Saldo insuficiente: " + this.saldo);
        }
    }
}
