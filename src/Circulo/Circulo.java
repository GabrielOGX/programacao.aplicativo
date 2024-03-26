package Circulo;

public class Circulo {
    double raio;

    public void calcularArea(){
        double area = Math.PI * Math.pow (raio,2);
        System.out.println("Area do Circulo:"+area);

    }
}
