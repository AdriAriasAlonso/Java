package practica6;

import java.util.Scanner;

public class Cubo implements Interfaz{
    private double lado;

    public Cubo(int lado) {
        this.lado = lado;
    }

    public Cubo() {
    }    

    public double getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() throws NumberFormatException{
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduce el valor del lado del cubo en centimetros: ");
        this.setLado(Integer.parseInt(lector.nextLine()));
        double area;
        area=(Math.pow(this.getLado(), 2))*6;
        return area;
    }
    
    @Override
    public double calcularVolumen(){
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduce el valor del lado del cubo en centimetros: ");
        try{
            this.setLado(Integer.parseInt(lector.nextLine()));
        }catch (Exception NumberFormatException){
            System.out.println("Tipo de dato incorrecto:");
            calcularVolumen();
        }
        double volumen;
        volumen=(Math.pow(this.getLado(),3));
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
