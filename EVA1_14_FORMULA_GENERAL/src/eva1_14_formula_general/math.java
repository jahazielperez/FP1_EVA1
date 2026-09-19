/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_14_formula_general;

import java.util.Scanner;

/**
 *
 * @author jahaziel
 */
class math {

    static double sqrt(double d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double x1 = (-1 * b + math.sqrt(b*b) - (4*a*c)) / (2 * a);
        double x2 = (-1 * b - math.sqrt(b*b) - (4*a*c)) / (2 * a);
        System.out.println("Raiz x1 = " + x1);
        System.out.println("Raiz x2 = " + x2);
    
    
    
    
    
    
    
    
    }
    
}
