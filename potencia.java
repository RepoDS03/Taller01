/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potencia;

import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Administrador
 */
public class potencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner n1 = new Scanner(System.in);
        Scanner n2 = new Scanner(System.in);
        
        System.out.println("Ingrese el numero que va a servir de base: ");
        int num1 = n1.nextInt();
        System.out.println("Ingrese el numero que va a ser exponente: ");
        int num2 = n2.nextInt();
        
        System.out.println("El resultado de elevar "+num1+" a la potencia "+num2+" es "+(Math.pow(num1,num2)));
    }
    
}
