
package proyect.pkg4;

import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Proyect4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        int numero = 0;
        Scanner sm = new Scanner (System.in);
        System.out.println("ingrese un numero");
        numero = sm.nextInt();
        int suma=0;
        int i = 0;
        while ( i <= numero){
        suma = suma + i;
        i = i+2;
        
      
    }
        System.out.println("la suma de los numeros pares es :"+ suma);
}
}
