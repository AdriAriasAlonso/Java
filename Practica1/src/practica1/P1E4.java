package practica1;

import java.util.Scanner;

/* 4. Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el
último, el segundo, el penúltimo, el tercero, etc.*/
public class P1E4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[] resultado=new int[10];
        
        for (int i=0;i<10;i++){
            resultado[i]=lector.nextInt();
        }
        System.out.println("Aquí está el print");
        for (int i=0;i<5;i++){
            System.out.println(resultado[i]);
            System.out.println(resultado[9-i]);
        } 
    }
}
