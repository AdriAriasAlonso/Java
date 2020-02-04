package practica1;

import java.util.Scanner;

public class P1E3 {
    
    public static void main(String[] args) {
        /*Leer 5 números por teclado y a continuación realizar la media de los números
    positivos, la media de los negativos y contar el número de ceros.*/
        
        Scanner lector = new Scanner(System.in);
        int numeros[]=new int [5];
        int suma_pos,cont_pos,suma_neg,cont_neg,cont_cero;

        suma_pos=0;
        cont_pos=0;
        suma_neg=0;
        cont_neg=0;
        cont_cero=0;
        
        for (int i=0;i<5;i++){
            numeros[i]=lector.nextInt();
            if(numeros[i]>0){
                suma_pos=suma_pos+numeros[i];
                cont_pos++;
            }
            if(numeros[i]<0){
                suma_neg=suma_neg+numeros[i];
                cont_neg++;
            }
            if(numeros[i]==0){
                cont_cero++;
            }
        }
        System.out.println("La media de tus numeros positivos es "+suma_pos/cont_pos);
        System.out.println("La media de tus numeros negativos es "+suma_neg/cont_neg);
        System.out.println("El numero de ceros es "+cont_cero);
    }
}