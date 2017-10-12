/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class suma {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner n1 = new Scanner(System.in);
        Scanner n2 = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        int num1 = n1.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = n2.nextInt();
        
        System.out.println("La suma de "+num1+" y "+num2+" es "+(num1+num2));
        
    }
    
}
