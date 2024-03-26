package Lampada;

public class Lampada {
    boolean estado; //true ou false

    public void ligar(){
        this.estado = true;
        System.out.println("Lampada ligada");
    }
    public void desligar(){
        this.estado = false;
        System.out.println("Lampada desligada");
    }
}