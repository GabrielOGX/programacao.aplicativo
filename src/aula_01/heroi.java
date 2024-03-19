package aula_01;

public class heroi {
    String nome;
    int vida = 100;
    int forca;

    int cura = 20;


    public void atacar(heroi alvo) {
        alvo.vida -= this.forca;
        System.out.println(this.nome + " atacar " + alvo.nome + " e causa " + this.forca + " de dano.");

    }

    public void status(heroi status) {

        status.vida = this.vida;
        System.out.println(this.nome + " Está com " + this.vida + " de vida.");

    }

    public void curar(heroi cura) {
        cura.vida = cura.vida + this.cura;
        if (cura.vida > 100) {
            cura.vida = 100;
        }
        System.out.println(cura.nome + " Se cura, e fica com " + cura.vida + " de vida.");

    }


}
