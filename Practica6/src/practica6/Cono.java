package practica6;

import java.util.Scanner;

public class Cono implements Interfaz{
    private double radio;
    private double altura;

    public Cono(double lado, double altura) {
        this.radio = lado;
        this.altura = altura;
    }

    public Cono() {
    }    

    public double getLado() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() throws NumberFormatException{
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduce el valor del radio del cono en centimetros: ");
        this.setRadio(Integer.parseInt(lector.nextLine()));
        System.out.println("Introduce el valor de la altura del cono en centimetros: ");
        this.setRadio(Integer.parseInt(lector.nextLine()));
        double generatriz=Math.sqrt(Math.pow(this.getAltura(), 2)+(Math.pow(this.getLado(), 2)));
        double area;
        area=(Math.PI*this.getLado()*generatriz)+(Math.PI*Math.pow(this.getLado(), 2));
        return area;
    }
    
    @Override
    public double calcularVolumen(){
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduce el valor del radio del cono en centimetros: ");
        try{
        this.setRadio(Integer.parseInt(lector.nextLine()));
        }catch (Exception NumberFormatException){
            System.out.println("Tipo de dato incorrecto:");
            calcularVolumen();
        }
        System.out.println("Introduce el valor de la altura del cono en centimetros: ");
        try{
        this.setAltura(Integer.parseInt(lector.nextLine()));
        }catch (Exception NumberFormatException){
            System.out.println("Tipo de dato incorrecto:");
            calcularVolumen();
        }
        double volumen;
        volumen=1/3*Math.PI*Math.pow(this.getLado(), 2)*this.getAltura();
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
