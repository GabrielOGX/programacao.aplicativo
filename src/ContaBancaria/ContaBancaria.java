package ContaBancaria;

public class ContaBancaria {

        //atributos
        int numeroDaConta;
        String nomeDoTitular;
        double saldo = 0;

        //métodos
        public void depositar(double valor) {
            this.saldo = this.saldo + valor;
        }

        public double sacar(double saque) {
            if ((this.saldo >= 0) && (saque <= this.saldo)) {
                this.saldo = this.saldo - saque;
            }else{
                System.out.println("Saldo insuficiente!");
            }
            return this.saldo;
        }
        public void exibirSaldo(){
            System.out.println("Novo saldo:"+this.saldo);
        }


    }

