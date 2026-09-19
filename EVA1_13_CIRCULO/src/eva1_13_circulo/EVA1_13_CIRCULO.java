/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_circulo;

import java.util.Scanner;

/**
 *
 * @author jahaziel
 */
public class EVA1_13_CIRCULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //AREA, PERIMETRO, VOLUMEN
        double radio,per,are, vol;
        Scanner captu = new Scanner(System.in);
        //realizar el calculo
        System.out.println("radio: ");
        radio = captu.nextDouble();
        per = (2 * 3.1416 * radio);
        are = (radio * radio * 3.1416);
        vol = (4 / 3.0) * 3.1416 * radio * radio;
        //capturar resultado
         System.out.println("perimetro =" + per);
         System.out.println("area =" + are);
         System.out.println("volumen =" + vol);
        
        
        
        
    }
    
}
