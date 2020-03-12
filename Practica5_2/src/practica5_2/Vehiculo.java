package practica5_2;

import java.util.Scanner;

public class Vehiculo {
    public static int contador=0;
    private int id;
    private String matricula;
    private String modelo;
    private int potencia;

    public Vehiculo(int id, String matricula, String modelo, int potencia) {
        this.id = id;
        this.matricula = matricula;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public Vehiculo() {
    }
    
    public Vehiculo(Vehiculo v1) {
        this.id = v1.id;
        this.matricula = v1.matricula;
        this.modelo = v1.modelo;
        this.potencia = v1.potencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id=contador;
        contador++;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula,Scanner lector) {
        if (matricula==matricula.toUpperCase()){
            this.matricula = matricula;
        }else{
            System.out.println("Error: la matrícula tiene que introducirse en mayúsculas.");
            System.out.println("Introduce la matrícula del vehículo: ");
            matricula=lector.nextLine();
        }
        
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        modelo.toLowerCase();
        Character.toUpperCase(modelo.charAt(0));
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia, Scanner lector) {
        if (potencia>0){
            this.potencia = potencia;
        }else{
            System.out.println("Error, la potencia tiene que ser mayor que 0.");
            potencia=Integer.parseInt(lector.nextLine());
        }
    }
    
    public void mostrarAtributos(){
        //Muestra los atributos del objeto
        System.out.println("Id: "+this.getId());
        System.out.println("Matricula: "+this.getMatricula());
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Potecia: "+this.getPotencia());
    }
    public void pedirAlta(Scanner lector){
        System.out.println("Introduce la matrícula del vehículo: ");
        setMatricula(lector.nextLine(),lector);
        System.out.println("Introduce el modelo del vehículo: ");
        setModelo(lector.nextLine());
        System.out.println("Introduce la potencia del vehículo en caballos: ");
        setPotencia(Integer.parseInt(lector.nextLine()),lector);
        setId(id);
    }
}
