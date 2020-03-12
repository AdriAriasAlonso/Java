package practica5;

import java.util.ArrayList;
import java.util.Scanner;

public class Practica5 {

    public static void main(String[] args) {
        //Menu del programa
        Scanner lector=new Scanner(System.in);
        ArrayList<Empleado> listaTrabajadores=new ArrayList<Empleado>();
        int opcion=0;
        while (opcion!=5){
            System.out.println("==============MENU==============");
            System.out.println("1) Pedir Alta Empleado.");
            System.out.println("2) Pedir Alta Comercial.");
            System.out.println("3) Pedir Alta Repartidor.");
            System.out.println("4) Mostrar Atributos Trabajador");
            System.out.println("================================");
            System.out.println("Introduce una opción: ");
            opcion=Integer.parseInt(lector.nextLine());
            switch (opcion){
                case 1:
                    Empleado empleado=new Empleado();
                    empleado.pedirAlta(lector);
                    listaTrabajadores.add(empleado);
                    break;
                
                case 2:
                    Comercial comercial=new Comercial();
                    comercial.pedirAlta(lector);
                    listaTrabajadores.add(comercial);
                    break;
                
                case 3:
                    Repartidor repartidor=new Repartidor();
                    repartidor.pedirAlta(lector);
                    listaTrabajadores.add(repartidor);
                    break;
                
                case 4:
                    //el programa principal, ofrecerá en el menú la opción de 
                    //mostrarAtributos de cualquiera de los tipos de empleado.
                    Scanner sn=new Scanner(System.in);
                    System.out.println("===Lista de trabajadores===");
                    for (int i=0;i<listaTrabajadores.size();i++){
                        System.out.println(i+".- "+listaTrabajadores.get(i).getNombre()+" "+listaTrabajadores.get(i).getApellido1() );
                    }
                    System.out.println("Elige una opción: ");
                    int trabajador=Integer.parseInt(sn.nextLine());
                    listaTrabajadores.get(trabajador).mostrarAtributos();
                    break;
            }
        }
    }
}
