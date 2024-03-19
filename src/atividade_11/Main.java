package atividade_11;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Livro livro1 = new Livro();
        System.out.println("Informe o titulo do livro: ");
        String titulo = leia.next();
        System.out.println("Informe o autor do livro: ");
        String autor = leia.next();
        System.out.println("Informe o ano de publicação do livro: ");
        String anoDePublicacao = leia.next();
    }

}
