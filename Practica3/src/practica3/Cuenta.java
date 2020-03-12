package practica3;

import java.util.Scanner;

public class Cuenta {
/*Escribe una clase Cuenta para representar una cuenta bancaria. Los datos 
de la cuenta son: nombre del cliente (String), número de cuenta (String), 
tipo de interés (double) y saldo (double). La clase contendrá los siguientes 
métodos: 
Constructor por defecto. 
Constructor con todos los parámetros. 
Constructor copia. 
Métodos setters/getters para asignar y obtener los datos de la cuenta. 
Métodos ingreso y reintegro.  
    
Un ingreso consiste en aumentar el saldo en la cantidad que se indique. Esa 
cantidad no puede ser negativa.
Un reintegro consiste en disminuir el saldo en una cantidad pero antes se debe 
comprobar que hay saldo suficiente. La cantidad no puede ser negativa.  
Los métodos ingreso y reintegro devuelven true si la operación se ha podido 
realizar o false en caso contrario. 
    
Método transferencia. Debe permitir pasar dinero de una cuenta a otra siempre 
que en la cuenta de origen haya dinero suficiente para poder hacerla.
Ejemplo de uso del método transferencia: cuentaOrigen.transferencia
(cuentaDestino, importe) que indica que queremos hacer una transferencia desde 
cuentaOrigen a cuentaDestino del importe indicado. 
    
Clase main. Desarrolla otra clase que tenga el main, y ponga a prueba todos los 
métodos de la clase Cuenta mediante un menú de usuario que se ejecutará 
indefinidamente hasta que este quiera salir.
*/
    //Atributos de la cuenta
    private String nombre;
    private String numcuenta;
    private Double interes;
    private Double saldo;
    
    //Constructores
    public Cuenta(String nombre, String numcuenta, Double interes, Double saldo) {
        this.nombre = nombre;
        this.numcuenta = numcuenta;
        this.interes = interes;
        this.saldo = saldo;
    }

    public Cuenta() {
    }
    
    public Cuenta(Cuenta c1) {
        this.nombre = c1.nombre;
        this.numcuenta = c1.numcuenta;
        this.interes = c1.interes;
        this.saldo = c1.saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(String numcuenta) {
        this.numcuenta = numcuenta;
    }

    public Double getInteres() {
        return interes;
    }

    public void setInteres(Double interes) {
        this.interes = interes;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    //Metodo ingreso
    public boolean ingreso(){
        double n;
        Scanner lector=new Scanner(System.in);     
        n=lector.nextDouble();
        if (n<0){
            return false;
        }
        else{
            this.setSaldo(saldo+n);
        }
        return true;
    }

    //Metodo reintegro
    public boolean reintegro(){
        double n;
        Scanner lector=new Scanner(System.in);
        n=lector.nextDouble();
        if (n < 0) {
            return false;
        } else if (saldo >= n) {
            this.setSaldo(saldo-n);
        } else {
            return false;
        }
        return true;
    }
    
    //Metodo transferencia
    public void transferencia(Cuenta c) {
        double n;
        Scanner lector=new Scanner(System.in);
        n=lector.nextDouble();
        if (n < 0) {
            System.out.println("La cantidad es negativa, imposible enviar "
                    + "dinero.");
        } else if (saldo >= n) {
            this.setSaldo(saldo-n);
            c.setSaldo(c.saldo+n);
            System.out.println("Se ha realizado la operación con éxito.");
        } else {
            System.out.println("La cantidad a enviar es mayor que la cantidad "
                    + "en la cuenta.");
        }
    }
}
