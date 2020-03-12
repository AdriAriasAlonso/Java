package practica5;

import java.util.Scanner;

public class Empleado {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String nif;
    private int edad;
    private int salario;

    public Empleado(String nombre, String apellido1, String apellido2, String nif, int edad, int salario) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nif = nif;
        this.edad = edad;
        this.salario = salario;
    }

    public Empleado() {
    }
    
    public Empleado(Empleado e1) {
        this.nombre = e1.nombre;
        this.apellido1 = e1.apellido1;
        this.apellido2 = e1.apellido2;
        this.nif = e1.nif;
        this.edad = e1.edad;
        this.salario = e1.salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre,Scanner lector) {
        while(!Character.isUpperCase(nombre.charAt(0))){
            System.out.println("Error:el nombre tiene que empezar por mayúscula.");
            System.out.println("Introduce el nombre: ");
            nombre=lector.nextLine();
        }
        this.nombre = nombre;
    }
    

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1,Scanner lector) {
        while(!Character.isUpperCase(apellido1.charAt(0))){
            System.out.println("Error:el nombre tiene que empezar por mayúscula.");
            System.out.println("Introduce el nombre: ");
            apellido1=lector.nextLine();
        }
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2,Scanner lector) {
        while(!Character.isUpperCase(apellido2.charAt(0))){
            System.out.println("Error:el nombre tiene que empezar por mayúscula.");
            System.out.println("Introduce el nombre: ");
            apellido2=lector.nextLine();
        }
        this.apellido2 = apellido2;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad,Scanner lector) {
        while(edad<16){
            System.out.println("Error:la edad es menor a 16.");
            System.out.println("Introduzca nueva edad: ");
            edad=Integer.parseInt(lector.nextLine());
        }
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    public void mostrarAtributos(){
        //Se encarga de mostrar por pantalla los atributos del objeto.
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Primer Apellido: "+this.getApellido1());
        System.out.println("Segundo Apellido: "+this.getApellido2());
        System.out.println("Edad: "+this.getEdad());
        System.out.println("NIF: "+this.getNif());
        System.out.println("Salario: "+this.getSalario());
    }
    
    public void pedirAlta(Scanner lector){
        //Se encarga de pedir al usuario los atributos del objeto.
        System.out.println("Introduce el nombre del Empleado: ");
        setNombre(lector.nextLine(),lector);
        System.out.println("Introduce el primer apellido del Empleado: ");
        setApellido1(lector.nextLine(),lector);
        System.out.println("Introduce el segundo apellido del Empleado: ");
        setApellido2(lector.nextLine(),lector);
        System.out.println("Introduce la edad del Empleado: ");
        setEdad(Integer.parseInt(lector.nextLine()),lector);
        System.out.println("Introduce el NIF del Empleado: ");
        setNif(lector.nextLine());
        System.out.println("Introduce el salario del Empleado: ");
        setSalario(Integer.parseInt(lector.nextLine()));
    }
}
