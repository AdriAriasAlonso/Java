package practica5_2;

import java.util.Scanner;

public class VTC extends Vehiculo{
    private int horasTrabajadas;
    private int radioAccion;
    private String ciudad;

    public VTC(int horasTrabajadas, int radioAccion, String ciudad, int id, String matricula, String modelo, int potencia) {
        super(id, matricula, modelo, potencia);
        this.horasTrabajadas = horasTrabajadas;
        this.radioAccion = radioAccion;
        this.ciudad = ciudad;
    }
    
    public VTC() {
    }
    
    public VTC(VTC vt1) {
        super((Vehiculo)vt1);
        this.horasTrabajadas = vt1.horasTrabajadas;
        this.radioAccion = vt1.radioAccion;
        this.ciudad = vt1.ciudad;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getRadioAccion() {
        return radioAccion;
    }

    public void setRadioAccion(int radioAccion) {
        this.radioAccion = radioAccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    @Override
    public void mostrarAtributos(){
        //Muestra los atributos del objeto
        super.mostrarAtributos();
        System.out.println("Horas trabajadas: "+this.getHorasTrabajadas());
        System.out.println("Radio de acción: "+this.getRadioAccion());
        System.out.println("Ciudad: "+this.getCiudad());
    }
    
    @Override
    public void pedirAlta(Scanner lector){
        super.pedirAlta(lector);
        System.out.println("Introduce las horas trabajadas por el VTC: ");
        setHorasTrabajadas(Integer.parseInt(lector.nextLine()));
        System.out.println("Introduce el radio de acción del VTC: ");
        setRadioAccion(Integer.parseInt(lector.nextLine()));
        System.out.println("Introduce la ciudad del VTC: ");
        setCiudad(lector.nextLine());
    }
}
