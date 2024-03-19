package Livro;

public class Livro {
    String titulo;
    String autor;
    String anoDePublicacao;

    public void exibirDetalhes(){
        System.out.println("Titulo:"+this.titulo);
        System.out.println("Autor"+this.autor);
    }
}