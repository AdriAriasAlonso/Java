package practica1;

import java.util.Scanner;

public class P1E7 {
    public static void main(String[] args) {
        /*Incluye los 6 ejercicios anteriores en métodos, y realiza un programa principal que
    pida al usuario que método quiere ejecutar y llame a este.*/
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        
        while(!salir){
            
           System.out.println("1. Ejercicio 1");
           System.out.println("2. Ejercicio 2");
           System.out.println("3. Ejercicio 3");
           System.out.println("4. Ejercicio 4");
           System.out.println("5. Ejercicio 5");
           System.out.println("6. Ejercicio 6");
           System.out.println("7. Salir"); 
           System.out.println("Escribe una de las opciones");
           opcion = sn.nextInt();
            
           switch(opcion){
               case 1:
                   System.out.println("Has seleccionado la opcion 1");
                   ejercicio1();
                   break;
               case 2:
                   System.out.println("Has seleccionado la opcion 2");
                   ejercicio2();
                   break;
                case 3:
                   System.out.println("Has seleccionado la opcion 3");
                   ejercicio3();
                   break;
                case 4:
                   System.out.println("Has seleccionado la opcion 4");
                   ejercicio4();
                   break;
                case 5:
                   System.out.println("Has seleccionado la opcion 5");
                   ejercicio5();
                   break;
                case 6:
                   System.out.println("Has seleccionado la opcion 6");
                   ejercicio6();
                   break;
                case 7:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 4");
           }
       }
    }
    public static void ejercicio1(){
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
    public static void ejercicio2(){
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
    public static void ejercicio3(){
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
    public static void ejercicio4(){
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
    public static void ejercicio5(){
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
    public static void ejercicio6(){
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
