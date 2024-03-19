package Funcionario;

public class Funcionario {
    String nome;
    String departamento;
    double salario;//1000

    public void aumentarSalario(double percentual){
        double aumento = this.salario * (percentual/100);
        this.salario = this.salario + aumento;
        System.out.println("O novo Salário é:"+this.salario);
    }
}
