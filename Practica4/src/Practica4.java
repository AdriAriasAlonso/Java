import java.util.ArrayList;
import java.util.Scanner;

public class Practica4 {

    public static void main(String[] args) {
        Pelicula peli=new Pelicula();
        ArrayList<Pelicula> listaPeliculas=new ArrayList<Pelicula>();
        //peli.añadirPelicula(listaPeliculas, 0);
        //peli.listarPeliculas(listaPeliculas);
        Scanner sn=new Scanner(System.in);
        int idinc=0;
        int opcion=0;
        int ncopias=0;
        while (opcion !=4){
            System.out.println("====================");
            System.out.println("      = MENU =      ");
            System.out.println("====================");
            System.out.println("1) Añadir Película");
            System.out.println("2) Reservar Película");
            System.out.println("3) Buscar Película");
            System.out.println("4) Salir");
            System.out.println("====================");
            System.out.print("Introducir opción: ");

            opcion = Integer.parseInt(sn.nextLine());
            switch(opcion){
                case 1:
                    peli.añadirPelicula(listaPeliculas,ncopias);
                    break;
                case 2:
                    peli.reservarPelicula(listaPeliculas);
                    break;
                case 3:
                    peli.buscarPelicula(listaPeliculas);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }
        }
    }
}