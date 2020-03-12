package practica5;

import java.util.Scanner;

final public class Repartidor extends Empleado{
    private int horasTrabajadas;
    private String zona;

    public Repartidor(int horasTrabajadas, String zona) {
        this.horasTrabajadas = horasTrabajadas;
        this.zona = zona;
    }

    public Repartidor() {
    }
    
    public Repartidor(Repartidor r1) {
        this.horasTrabajadas = r1.horasTrabajadas;
        this.zona = r1.zona;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
    @Override
    public void mostrarAtributos(){
        //Se encarga de mostrar por pantalla los atributos del objeto.
        super.mostrarAtributos();
        System.out.println("Horas Trabajadas: "+getHorasTrabajadas());
        System.out.println("Zona: "+getZona());
    }
    
    @Override
    public void pedirAlta(Scanner lector){
        //Se encarga de pedir al usuario los atributos del objeto.
        super.pedirAlta(lector);
        System.out.println("Introduce las horas trabajadas por el Repartidor: ");
        setHorasTrabajadas(Integer.parseInt(lector.nextLine()));
        System.out.println("Introduce la zona del Repartidor: ");
        setZona(lector.nextLine());
    }
}
