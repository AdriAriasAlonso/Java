package practica1;

import java.util.Scanner;

/*6. Leer los datos correspondientes a dos series de 12 elementos numéricos, y
mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3
de la B, etc.*/
public class P1E6 {
    public static void main(String[] args) {
        
        System.out.println("Llena la primera lista");
        
        Scanner lector = new Scanner(System.in);
        int[] resultado=new int[12];
    
        for (int i=0;i<12;i++){
            resultado[i]=lector.nextInt();
        }
        
        System.out.println("Ahora llena la segunda lista");
        
        int[] resultado2=new int[12];
        
        for (int i=0;i<12;i++){
            resultado2[i]=lector.nextInt();
        }
        
        System.out.println("Aqui estan tus numeros");
        
        //Declaro la tercera lista
        
        int[] resultado3=new int[24];
        
        for (int i=0;i<4;i++){
            resultado3[6*i]=resultado[3*i];
            resultado3[6*i+1]=resultado[3*i+1];
            resultado3[6*i+2]=resultado[3*i+2];
            resultado3[6*i+3]=resultado2[3*i];
            resultado3[6*i+4]=resultado2[3*i+1];
            resultado3[6*i+5]=resultado2[3*i+2];
        }
        
        //Imprimo la tercera lista
        
        for (int i=0;i<24;i++){
            System.out.println(resultado3[i]);
        }
    }
}
