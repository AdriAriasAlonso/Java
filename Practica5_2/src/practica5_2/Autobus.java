package practica5_2;

import java.util.Scanner;

public class Autobus extends Vehiculo{
    private int numeroPlazas;
    private int numeroParadas;

    public Autobus(int numeroPlazas, int numeroParadas, int id, String matricula, String modelo, int potencia) {
        super(id, matricula, modelo, potencia);
        this.numeroPlazas = numeroPlazas;
        this.numeroParadas = numeroParadas;
    }

    public Autobus() {
    }

    public Autobus(Autobus a1) {
        super((Vehiculo)a1);
        this.numeroPlazas = a1.numeroPlazas;
        this.numeroParadas = a1.numeroParadas;
    }
    
    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public int getNumeroParadas() {
        return numeroParadas;
    }

    public void setNumeroParadas(int numeroParadas,Scanner lector) {
        if(numeroParadas>3 && numeroParadas<20){
            this.numeroParadas = numeroParadas;
        }else{
            System.out.println("Numero de paradas incorrecto.Tiene que ser un numero"
                    + "mayor que 3 y menor a 20");
            numeroParadas=Integer.parseInt(lector.nextLine());
        }
    }
    
    @Override
    public void mostrarAtributos(){
        //Muestra los atributos del objeto
        super.mostrarAtributos();
        System.out.println("Numero de plazas: "+this.getNumeroPlazas());
        System.out.println("Numero de paradas: "+this.getNumeroParadas());
    }
    @Override
    public void pedirAlta(Scanner lector){
        super.pedirAlta(lector);
        System.out.println("Introduce el número de plazas del autobús: ");
        setNumeroPlazas(Integer.parseInt(lector.nextLine()));
        System.out.println("Introduce el número de paradas del autobús: ");
        setNumeroParadas(Integer.parseInt(lector.nextLine()),lector);
    }
}
