import java.util.*;
public class Fibonacci {
   
    /*---ITERATIVA---*/
    public int fibo(int n) {
        int inicio = 0, siguiente = 1, resultado = 0;
        
        for (int i = 1; i < n; i++) {
            resultado = inicio + siguiente;
            inicio = siguiente; 
            siguiente = resultado;
        }
        return resultado;
    }
    
    /*---RECURSIVA---*/
    public int Fibonacci(int n) {
        if(n==1 || n==2) {
            return 1;            
        }
        
        else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }        
    }   
    
    public static void main(String[] args) {
        int opcion;
        Scanner s = new Scanner(System.in);
        Fibonacci fib = new Fibonacci();   
        
        do {
            System.out.println("\n------------Teclee una opcion------------\n"
            + "1) Secuencia FIBONACCI iterativa\n"
            + "2) Secuencia FIBONACCI recursiva\n"
            + "0) Salir\n");            
            opcion = s.nextInt();            
            switch(opcion) {
                case 1: System.out.println("Introduce el limite de la sucesion"); 
                int numero = s.nextInt(); int sucesion = fib.Fibonacci(numero); System.out.println("La sucesion de " + numero + " es: " + sucesion + "\n");
                break;                
                case 2: System.out.println("Introduce el limite de la sucesion");
                numero = s.nextInt(); sucesion = fib.fibo(numero); System.out.println("La sucesion de " + numero + " es: " + sucesion + "\n");            
            }
        } while(opcion != 0);
    }
}