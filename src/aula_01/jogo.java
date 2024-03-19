package aula_01;

public class jogo {
    public static void main(String[] args) {

        heroi heroi1 = new heroi();
        heroi1.nome = "Arthur";
        heroi1.forca = 10;

        heroi heroi2 = new heroi();
        heroi2.nome = "Marlin";
        heroi2.forca = 25;

        mago mago1 = new mago();
        mago1.nome = "Gandalf";
        mago1.forca = 30;


        heroi1.atacar(heroi2);
        heroi2.atacar(heroi1);


        heroi1.status(heroi1);
        heroi2.status(heroi2);
        mago1.status(mago1);

        heroi1.curar(heroi1);
        heroi2.curar(heroi2);

        mago1.lancarMagia(heroi2);

        heroi2.status(heroi2);
    }
}
