package Animal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Animal animal = new Animal();
        animal.nome = "Jurupeba";
        animal.tipo = "Galinha";
        animal.idade = 20;
        System.out.println("Digite o som do animal:");
        String som = leia.next();
        animal.emitirSom(som);
    }
}
