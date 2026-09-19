/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_formula_general;

import java.util.Scanner;

/**
 *
 * @author jahaziel
 */
public class EVA1_14_FORMULA_GENERAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double x1 = (-1 * b + Math.sqrt(b*b - 4*a*c)) / (2 * a);
        double x2 = (-1 * b - Math.sqrt(b*b - 4*a*c)) / (2 * a);
        System.out.println("Raiz x1 = " + x1);
        System.out.println("Raiz x2 = " + x2);
        
        
    }
    
}
