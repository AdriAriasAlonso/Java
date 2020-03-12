package practica6;

import java.util.Scanner;

public class Practica6 {

    public static void main(String[] args) {
        Cubo instcubo = new Cubo();
        Cono instcono = new Cono();
        Esfera instesfera = new Esfera();
        Scanner lector = new Scanner(System.in);

        boolean salir = false;
        int opcion = 0;
        while (salir == false) {
            System.out.println("========MENU========");
            System.out.println("Introduce una opción");
            System.out.println("1)              Cubo");
            System.out.println("2)              Cono");
            System.out.println("3)            Esfera");
            System.out.println("4)             Salir");
            System.out.println("====================");
            opcion = Integer.parseInt(lector.nextLine());
            switch (opcion) {
                case 1:
                    try {
                        instcubo.imprimirCaracteristicas();
                    } catch (Exception NumberFormatException) {
                        System.out.println("Tipo de dato no valido.");
                    }
                    break;
                case 2:
                    try {
                        instcono.imprimirCaracteristicas();
                    } catch (Exception NumberFormatException) {
                        System.out.println("Tipo de dato no valido.");
                    }
                    break;
                case 3:
                    try {
                        instesfera.imprimirCaracteristicas();
                    } catch (Exception NumberFormatException) {
                        System.out.println("Tipo de dato no valido.");

                    }
                    break;
                case 4:
                    salir = true;
            }
        }
    }
}
