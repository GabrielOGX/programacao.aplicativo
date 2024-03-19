package Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "PiguiMeu";
        funcionario.departamento= "Compras";
        funcionario.salario = 3000;
        funcionario.aumentarSalario(10);
    }
}
