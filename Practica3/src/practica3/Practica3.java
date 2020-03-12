package practica3;

import java.util.Scanner;

public class Practica3 {


    public static void main(String[] args) {
        /*Clase main. Desarrolla otra clase que tenga el main, y ponga a 
        prueba todos los 
        métodos de la clase Cuenta mediante un menú de usuario que se ejecutará 
        indefinidamente hasta que este quiera salir.*/
        Scanner sn = new Scanner(System.in);
        int opcion=0; //Guardaremos la opcion del usuario
        Cuenta c1=new Cuenta("Adrian", "ES672389234FS-F", 20.00 , 6000.00);
        Cuenta c2=new Cuenta("Xisco","BR78623453453-L", 10.00, 300.00);
        while(opcion!=4){
            
            System.out.println("1. Ingresar Dinero");
            System.out.println("2. Retirar Dinero");
            System.out.println("3. Realizar Transferencia");
            System.out.println("4. Salir");
            System.out.println("Selecciona una opción");
            
            opcion = sn.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("===Menu Ingresos===");                    
                    System.out.println("Tu saldo es: "+ c1.getSaldo());
                    System.out.println("Introduce la cantidad a ingresar: ");
                    c1.ingreso();
                    System.out.println("Tu saldo ahora es: "+ c1.getSaldo());
                    break;
                case 2:
                    System.out.println("===Menu Reintegro===");
                    System.out.println("Tu saldo es: "+ c1.getSaldo());
                    System.out.println("Introduce la cantidad a retirar: ");
                    c1.reintegro();
                    System.out.println("Tu saldo ahora es: "+ c1.getSaldo());
                    break;
                case 3:
                    System.out.println("===Menu Transferencias===");
                    System.out.println("Tu saldo es: "+ c1.getSaldo());
                    System.out.println("El saldo de la segunda cuenta es: "+ c2.getSaldo());
                    System.out.println("Introduce la cantidad a transferir: ");
                    c1.transferencia(c2);
                    System.out.println("Tu saldo ahora es: "+ c1.getSaldo());
                    System.out.println("El saldo de la segunda cuenta es: "+ c2.getSaldo());
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
           }
        }
    }   
}
