/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad4_57297;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Actividad4_57297 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Pirmer ejercicio");  
        
     System.out.println("suma consecutiva del 0 al 10");
      int fac=1;
      int s=1;
    while (s<10){
    s++;
    System.out.println(s);
    fac=fac*s;
        System.out.println(fac);
    }
   
     System.out.println("[Segundo ejercicio]");  
    
        
        int fa=1, num, c=1;
        System.out.println("Introduzca un numero");
        num=entrada.nextInt();
        
        while (c<num){
        fa*=c;
        c++;
        }
        System.out.println("El factorial de "+num +" es: "+fa);
        
        System.out.println("Tercer Ejercicio");
        
        System.out.print("Introduce tu primer valor: ");
        int valor2 = 0;
        Scanner usuario2 = new Scanner (System.in);
        valor2 = usuario2.nextInt ( );
        
        System.out.print("Introduce tu segundo valor: ");
        int valor3 = 0;
        Scanner usuario3 = new Scanner (System.in);
        valor3 = usuario3.nextInt ( );
        
        int suma = valor2 + valor3;
        System.out.println("La suma de " + valor2 + "  más " + valor3 + " es " + suma);
        
        int promedio = suma / 2;
        
        System.out.println("Tu el promedio es: " + promedio);
        
        if (valor2 > valor3) {
            System.out.println(valor2 + " es mayor que " + valor3);
        }if (valor3 > valor2) {
            System.out.println(valor3 + " es mayor que " + valor2);
        }if (valor2 == valor3) {
            System.out.println("Tus valores son iguales");
        }
       
        if (valor2 < valor3) {
            System.out.println("La distancia numerica: ");
            int d = valor2;
        while (d < valor3) {
            d++;
            System.out.println(d);
            
          }
        }if (valor3 < valor2) {
            System.out.println("Distancia numerica: ");
            int e = valor3;
            while (e  < valor2) {
                e++;
                System.out.println(e);
        }
        }
    }
    
}
