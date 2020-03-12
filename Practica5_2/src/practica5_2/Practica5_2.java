package practica5_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Practica5_2 {

    public static void main(String[] args) {
        //Menú que ofrezca la posibilidad de dar de alta taxis, autobuses y 
        //VTC’s, y éstos sean almacenados en una estructura adecuada.Menu del programa
        Scanner lector=new Scanner(System.in);
        ArrayList<Vehiculo> listaVehiculos=new ArrayList<Vehiculo>();
        int opcion=0;
        while (opcion!=5){
            System.out.println("===============MENU===============");
            System.out.println("1) Dar alta Taxi.");
            System.out.println("2) Dar alta Autobús.");
            System.out.println("3) Dar alta VTC.");
            System.out.println("4) Buscar vehículo por ID.");
            System.out.println("5) Buscar vehículo por matrícula.");
            System.out.println("6) Buscar primer taxi libre.");
            System.out.println("7) Buscar taxi concreto por ID.");
            System.out.println("8) Mostrar todos los vehículos.");
            System.out.println("==================================");
            System.out.println("Introduce una opción: ");
            opcion=Integer.parseInt(lector.nextLine());
            switch (opcion){
                case 1:
                    Taxi taxi=new Taxi();
                    taxi.pedirAlta(lector);
                    listaVehiculos.add(taxi);
                    break;
                
                case 2:
                    Autobus autobus=new Autobus();
                    autobus.pedirAlta(lector);
                    listaVehiculos.add(autobus);
                    break;
                
                case 3:
                    VTC vtc=new VTC();
                    vtc.pedirAlta(lector);
                    listaVehiculos.add(vtc);
                    break;
                
                case 4:
                    System.out.println("==============================");
                    System.out.println("Introduce una ID de vehículo: ");
                    int idbusqueda=Integer.parseInt(lector.nextLine());
                    for (int i=0;i<listaVehiculos.size();i++){
                        if (listaVehiculos.get(i)==listaVehiculos.get(idbusqueda)){
                            listaVehiculos.get(i).mostrarAtributos();
                        }
                    }
                    System.out.println("==============================");
                    break;
                    
                case 5:
                    System.out.println("=====================================");
                    System.out.println("Introduce una matrícula de vehículo: ");
                    String matriculabusqueda=lector.nextLine();
                    for (int i=0;i<listaVehiculos.size();i++){
                        if (listaVehiculos.get(i).getMatricula()==matriculabusqueda){
                            listaVehiculos.get(i).mostrarAtributos(); 
                        }
                    }
                    System.out.println("=====================================");
                    break;
                    
                case 6:
                    //Buscar primer taxi libre
                    Taxi.buscarTaxi(listaVehiculos);
                    break;
                    
                case 7:
                    //Buscar taxi concreto por ID
                    Taxi.buscarTaxiPorId(listaVehiculos, lector);
                    break;
                    
                case 8:
                    System.out.println("=====================================");
                    System.out.println("=========Lista de vehículos==========");
                    for (int i=0;i<listaVehiculos.size();i++){
                        listaVehiculos.get(i).mostrarAtributos();
                    }
                    break;
            }
        }    
    }
}
