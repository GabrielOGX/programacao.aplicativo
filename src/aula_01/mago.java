package aula_01;

public class mago extends heroi {
    public void lancarMagia(heroi alvo) {
        alvo.vida = alvo.vida - this.forca;

        System.out.println(this.nome + " lança uma magia " + alvo.nome + " causo" + this.forca + " de dano.");
    }
}
