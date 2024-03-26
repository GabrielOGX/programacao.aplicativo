package Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Senai";
        aluno.matricula = "123456";
        aluno.curso = "Desenvolvimento de Sistemas";
        System.out.println(aluno.toString());
    }
}
