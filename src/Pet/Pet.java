package Pet;

public class Pet {
    String nome;
    String especie;
    int idade;
    public void exibir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Espécie: " + this.especie);
        System.out.println("Idade: " + this.idade);
    }
}
