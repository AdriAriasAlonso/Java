package practica6;

import java.util.Scanner;

public class Esfera implements Interfaz{
    private double radio;

    public Esfera(int lado) {
        this.radio = lado;
    }

    public Esfera() {
    }    

    public double getLado() {
        return radio;
    }

    public void setLado(int lado) {
        this.radio = lado;
    }
    
    @Override
    public double calcularArea() throws NumberFormatException{
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduce el valor del radio de la esfera en centimetros: ");
        this.setLado(Integer.parseInt(lector.nextLine()));
        double area;
        area=Math.PI*4*Math.pow(radio, 2);
        return area;
    }
    
    @Override
    public double calcularVolumen(){
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduce el valor del radio de la esfera en centimetros: ");
        this.setLado(Integer.parseInt(lector.nextLine()));
        double volumen;
        volumen=4/3*Math.PI*Math.pow(radio, 3);
        return volumen;
    }
    
    @Override
    public void imprimirCaracteristicas(){
        System.out.println("Características:");
        System.out.println("Nombre: Cubo");
        System.out.println("Area: " + calcularArea());
        System.out.println("Volumen: " + calcularVolumen());
    }
}
