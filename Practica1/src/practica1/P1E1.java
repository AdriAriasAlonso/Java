package practica1;
import java.util.Scanner;
        
public class P1E1 {
    
    public static void main(String[] args) {
        /*1. Leer 5 números (con bucle por favor, no pongáis 5 scanner 
        consecutivos) y mostrarlos en el mismo orden introducido.*/
        Scanner lector = new Scanner(System.in);
        int[] resultado=new int[5];
        
        for (int i=0;i<5;i++){
            resultado[i]=lector.nextInt();
        }
        for (int i=0;i<5;i++){
            System.out.println(resultado[i]);

        }   
    }
}