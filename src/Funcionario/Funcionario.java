package Funcionario;

public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;//1000
    public Funcionario(String nome,String departamento,
                       double salario){
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void aumentarSalario(double percentual){
        double aumento = this.salario * (percentual/100);
        this.salario = this.salario + aumento;
        System.out.println("O novo Salário é:"+this.salario);
    }
}