package practica5_2;

import com.oracle.webservices.internal.api.databinding.DatabindingModeFeature;
import java.util.ArrayList;
import java.util.Scanner;

public class Taxi extends Vehiculo{
    private int numeroLicencia;
    private boolean estado=false;
    private int numeroTaxistas;

    public Taxi(int numeroLicencia, boolean estado, int numeroTaxistas, int id, String matricula, String modelo, int potencia) {
        super(id, matricula, modelo, potencia);
        this.numeroLicencia = numeroLicencia;
        this.estado = estado;
        this.numeroTaxistas = numeroTaxistas;
    }
    
    public Taxi() {
    }
    
    public Taxi(Taxi t1) {
        super((Vehiculo)t1);
        this.numeroLicencia = t1.numeroLicencia;
        this.estado = t1.estado;
        this.numeroTaxistas = t1.numeroTaxistas;
    }

    public int getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia() {
        this.numeroLicencia = this.getId()+100;
    }

    public String isEstado() {
        if(estado){
            return "Ocupado";
        }else{
            return "Libre";
        }
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getNumeroTaxistas() {
        return numeroTaxistas;
    }

    public void setNumeroTaxistas(int numeroTaxistas) {
        this.numeroTaxistas = numeroTaxistas;
    }
    
    @Override
    public void mostrarAtributos(){
        //Muestra los atributos del objeto
        super.mostrarAtributos();
        System.out.println("Numero de licencia: "+this.getNumeroLicencia());
        System.out.println("Estado: "+this.isEstado());
        System.out.println("Numero máximo de taxistas: "+this.getNumeroTaxistas());
    }
    
    @Override
    public void pedirAlta(Scanner lector){
        super.pedirAlta(lector);
        setNumeroLicencia();
        System.out.println("Introduce el numero máximo de taxistas: ");
        setNumeroTaxistas(Integer.parseInt(lector.nextLine()));
    }
    
    public static void buscarTaxi (ArrayList<Vehiculo> listaVehiculos){
        //Buscar el primer taxi que encuentre libre e informará de su id, y pondrá su estado “ocupado”.
        int i=0;
        boolean existe=false;
        while (i<listaVehiculos.size() && existe==false){
            if(listaVehiculos.get(i) instanceof Taxi && "Libre".equals(((Taxi)listaVehiculos.get(i)).isEstado())){
                System.out.println("Matricula: "+listaVehiculos.get(i).getMatricula()+" ID: "+listaVehiculos.get(i).getId());
                ((Taxi)listaVehiculos.get(i)).setEstado(true);
                existe=true;
            }
            i++;
        }
    }
    
    public static void buscarTaxiPorId(ArrayList<Vehiculo> listaVehiculos, Scanner lector){
        //Buscar un taxi concreto por id y establecer que está libre.
        System.out.println("Introduce una ID de Taxi a buscar: ");
        int idabuscar=Integer.parseInt(lector.nextLine());
        int i=0;
        boolean existe=false;
        while(i<listaVehiculos.size() && existe==false){
            if(listaVehiculos.get(i).getId()==idabuscar){
                ((Taxi)listaVehiculos.get(i)).setEstado(false);
                System.out.println("Al Taxi con matríula "+listaVehiculos.get(i).getMatricula()+
                        " se le ha asignado el estado 'libre'.");
                existe=true;
            }
            i++;
        }
    }
    
}
