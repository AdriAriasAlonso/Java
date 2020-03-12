package practica5;

import java.util.Scanner;

public final class Comercial extends Empleado{
    private int ventasRealizadas;
    private int comision;

    public Comercial(int ventasRealizadas, int comision) {
        this.ventasRealizadas = ventasRealizadas;
        this.comision = comision;
    }

    public Comercial() {
    }
    
    public Comercial(Comercial c1) {
        this.ventasRealizadas = c1.ventasRealizadas;
        this.comision = c1.comision;
    }

    public int getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(int ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }
    
    @Override
    public void mostrarAtributos(){
        //Se encarga de mostrar por pantalla los atributos del objeto.
        super.mostrarAtributos();
        System.out.println("Comision: "+getComision());
        System.out.println("Ventas Realizadas: "+getVentasRealizadas());
    }
    
    @Override
    public void pedirAlta(Scanner lector){
        //Se encarga de pedir al usuario los atributos del objeto.
        super.pedirAlta(lector);
        System.out.println("Introduce la comision del Comercial: ");
        setComision(Integer.parseInt(lector.nextLine()));
        System.out.println("Introduce las ventas realizadas por el Comercial");
        setVentasRealizadas(Integer.parseInt(lector.nextLine()));
    }
}
