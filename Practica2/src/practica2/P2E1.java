package practica2;

import com.sun.jndi.url.iiop.iiopURLContext;
import com.sun.org.apache.xpath.internal.operations.Variable;
import java.util.Arrays;
import java.util.Scanner;
import sun.security.jgss.krb5.Krb5Util;

public class P2E1 {

    public static void main(String[] args) {
        
        /*Crea un proyecto Java, y en el programa principal incluye un menú 
        (con switch) que llame a los siguiente métodos. Este menú debe permitir 
        al usuario seleccionar el método que desea ejecutar, por tanto, los 
        siguientes ejercicios se incluirán en métodos (recuerda que el nombrado 
        del método debe ser representativo sobre la función que realiza).*/
        
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion=0; //Guardaremos la opcion del usuario
        
        while(opcion!=8){
            
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");
            System.out.println("6. Ejercicio 6");
            System.out.println("7. Ejercicio 7");
            System.out.println("8. Salir");
            
            System.out.println("Escribe una de las opciones");
            
            opcion = sn.nextInt();
            switch(opcion){
                case 2:
                    System.out.println("Has seleccionado el ejercicio 2");
                    ejercicio2();
                    break;
                case 3:
                    System.out.println("Has seleccionado el ejercicio 3");
                    ejercicio3();
                    break;
                case 4:
                    System.out.println("Has seleccionado el ejercicio 4");
                    ejercicio4();
                    break;
                case 5:
                    System.out.println("Has seleccionado el ejercicio 5");
                    ejercicio5();
                    break;
                case 6:
                    System.out.println("Has seleccionado el ejercicio 6");
                    ejercicio6();
                    break;
                case 7:
                    System.out.println("Has seleccionado el ejercicio 7");
                    ejercicio7();
                    break;    
                case 8:
                    salir=true;
                    break;
                default:
                    System.out.println("Solo números entre 2 y 8");
           }
        }
    }
    public static void ejercicio2(){
        /*Crear una tabla bidimensional de tamaño 5x5 y rellenarla de la 
        siguiente forma: la posición T[n,m] debe contener n+m. Después se debe 
        mostrar su contenido.*/
        int[][] arraybid = new int[5][5];
        //Lleno el array bidimensional con la suma de los dos arrays
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                arraybid[i][j]=i+j;
            }
        }
        //Imprimo el array
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                System.out.println(Arrays.toString(arraybid[i]));
            }
        }
    }
    public static void ejercicio3(){
        /*Crear y cargar una tabla de tamaño 4x4 y decir si es simétrica o 
        no, es decir, si se obtiene la misma tabla al cambiar filas por 
        columnas.*/
        int[][] num = new int[4][4];
        boolean simetrico;
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese los números.");
        for (int i = 0; i < num.length; i++) {//Dimensión Uno.
            for (int j = 0; j < num.length; j++) {//Dimensión Dos.
                  System.out.print("["+i+"]"+"["+j+"]"+"=");
                  num[i][j]=numero.nextInt();              
            }            
        }
        System.out.println("Imprimiendo Tabla.");
        for (int i = 0; i < num.length; i++) {
            System.out.println();
            for (int j = 0; j < num.length; j++) {
                  System.out.print(num[i][j] + " ");              
            }            
        }
        System.out.println("\nComprobando Simetria.");
        simetrico = true;
        int control = num.length -1;
        int i=0;
        while (i < control && simetrico == true) {            
            int j=0;
            while (j < control && simetrico == true) {                
                if(num[i][j] != num[j][i]){
                    simetrico = false;
                }
                j++;
            }
          i++;
        }
        if(simetrico){
            System.out.println("La tabla resulta Simétrica.");
        }
        else{
            System.out.println("La tabla no es Simétrica.");
        }
    }
    public static void ejercicio4(){
        /*Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma.*/
        Scanner numero = new Scanner(System.in);
        int [][] matriz1= new int [3][3];
        int [][] matriz2= new int [3][3];
        int [][] matriz3= new int [3][3];
        
        for (int i=0;i<matriz1.length;i++){
            for (int j = 0; j < matriz1.length; j++) {
               System.out.print("["+i+"]"+"["+j+"]"+"=");
               matriz1[i][j]=numero.nextInt();
            }
        }
        for (int i=0;i<matriz2.length;i++){
            for (int j = 0; j < matriz2.length; j++) {
               System.out.print("["+i+"]"+"["+j+"]"+"=");
               matriz2[i][j]=numero.nextInt();
            }
        }
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3.length; j++) {
                matriz3[i][j]=matriz1[i][j]+matriz2[i][j];
            }
        }
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3.length; j++) {
                System.out.print(matriz3[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void ejercicio5() {
        /*Crear una tabla de tamaño 7x7 y rellenarla de forma que los elementos 
        de la diagonal principal sean 1 y el resto 0*/
        int [][] matriz= new int [7][7];
        for (int i=0;i<7;i++){
            for (int j=0;j<7;j++){
                if (matriz[i][j]==matriz[j][i]){
                    matriz[i][j]=1;
                }
                else{
                    matriz[i][j]=0;
                    matriz[j][i]=0;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void ejercicio6(){
        /*Crear una matriz “marco” de tamaño 8x6: todos sus elementos deben ser 
        0 salvo los de los bordes que deben ser 1. Mostrar la matriz.*/
        int [][] marco= new int [8][6];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if (i==0 || i==7 || j==0 || j==5){
                    marco[i][j]=1;
                }
                else{
                    marco[i][j]=0;
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(marco[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void ejercicio7(){
        /*Crear una matriz “marco” cuyo tamaño se pedirá al usuario por teclado.
        Todos sus elementos deben ser 0 salvo los de los bordes que deben ser 1.
        Mostrar la matriz.*/
        int valori;
        int valorj;
        Scanner numero = new Scanner(System.in);
        System.out.println("Introduce el primer valor,i:");
        valori=numero.nextInt();
        System.out.println("Introduce el segundo valor,j:");
        valorj=numero.nextInt();
        int [][] marco= new int [valori][valorj];
        for (int i = 0; i < valori; i++) {
            for (int j = 0; j < valorj; j++) {
                if (i==0 || i==valori-1 || j==0 || j==valorj-1){
                    marco[i][j]=1;
                }
                else{
                    marco[i][j]=0;
                }
            }
        }
        for (int i = 0; i < valori; i++) {
            for (int j = 0; j < valorj; j++) {
                System.out.print(marco[i][j]+" ");
            }
            System.out.println("");
        }
    }
}

