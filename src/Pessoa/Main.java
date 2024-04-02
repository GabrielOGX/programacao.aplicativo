package Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o nome: ");
        String nome = leia.next();
        System.out.println("Informe a idade: ");
        int idade = leia.nextInt();
        System.out.println("CPF: ");
        String cpf = leia.next();
        Pessoa pessoa1 = new Pessoa(nome,idade,cpf);
        System.out.println(pessoa1.toString());

    }
}