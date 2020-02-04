
package practica1;

import java.util.Scanner;

public class P1E2 {
    
    public static void main(String[] args) {
        /*2. Leer 5 números y mostrarlos en orden inverso al introducido.*/
        Scanner lector = new Scanner(System.in);
        int[] resultado=new int[5];
        
        for (int i=0;i<5;i++){
            resultado[i]=lector.nextInt();
        }
        for (int i=4;i>=0;i--){
            System.out.println(resultado[i]);
        }   
    }
}
