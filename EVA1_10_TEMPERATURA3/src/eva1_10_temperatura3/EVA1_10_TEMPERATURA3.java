/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_temperatura3;

import java.util.Scanner;

/**
 *
 * @author jahaziel
 */
public class EVA1_10_TEMPERATURA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double kelvin,Far,cels;//variables (identificadores validos)
        Scanner captu = new Scanner(System.in);
        //SOLICITAR LOS DATOS AL USUARIO
        System.out.println("captura la temperatura en kelvin: ");
        kelvin = captu.nextDouble();
        //HACER EL CALCULO
        Far = (kelvin - 32) / 1.8 + 273.15;
        cels= kelvin + 273.15;
        //MOSTRAR RESULTADOS AL USUARIO
        System.out.println(kelvin + "°F = " + Far + "K = ");
        System.out.println(kelvin + "°C = " + cels + "K = ");
    

    }
}
    
    

