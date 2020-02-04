package practica1;

import java.util.Scanner;

/*5. Leer por teclado dos series de 10 números enteros y mezclarlas en una tercera de
la forma: el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc.*/

public class P1E5 {
    public static void main(String[] args) {
        
        System.out.println("Llena la primera lista");
        
        Scanner lector = new Scanner(System.in);
        int[] resultado=new int[10];
        
        for (int i=0;i<10;i++){
            resultado[i]=lector.nextInt();
        }
        
        System.out.println("Ahora llena la segunda lista");
        
        int[] resultado2=new int[10];
        
        for (int i=0;i<10;i++){
            resultado2[i]=lector.nextInt();
        }
        
        int[] resultado3=new int[20];
        
        System.out.println("Aqui estan tus numeros");
        
        int aux=0;
        
        for (int i=0;i<10;i++){
            resultado3[aux]=resultado[i];
            aux++;
            resultado3[aux]=resultado2[i];
            aux++;
        }
        for (int j=0;j<20;j++){
            System.out.println(resultado3[j]);
        }
    }
}
