/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Area;
import java.util.*;
/**
 *
 * @author Administrador
 */
public class Area {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base,altura;
        float area;
        System.out.println("Ingrese la altura:");
        altura=sc.nextInt();
        
        System.out.println("Ingrese la base:");
        base=sc.nextInt();
        
        area=(altura*base)/2;
        System.out.println("El area del triangulo es:"+area);
    }
}
