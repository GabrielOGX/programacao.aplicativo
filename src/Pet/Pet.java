package Pet;

public class Pet {
    String nome;
    String especie;
    int idade;
    //Métado Construtor
    //Cria um contrato de construção
    public Pet(String nome, String especie, int idade){
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }
    public void exibir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Espécie: " + this.especie);
        System.out.println("Idade: " + this.idade);
    }
}
