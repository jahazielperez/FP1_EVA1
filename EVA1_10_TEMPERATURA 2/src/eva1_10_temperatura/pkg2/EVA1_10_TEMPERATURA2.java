/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_temperatura.pkg2;

import java.util.Scanner;

/**
 *
 * @author jahaziel
 */
public class EVA1_10_TEMPERATURA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double far, celsius, kelvin;//variables (identificadores validos)
        Scanner captu = new Scanner(System.in);
        //SOLICITAR LOS DATOS AL USUARIO
        System.out.println("captura los grados fahrenheit ");
        far = captu.nextDouble();
        //HACER EL CALCULO
        celsius = (far - 32) / 1.8;// aqui si importa el parentesis
        kelvin = (far - 32) * (5 / 9.0) + 273.15;//ojo: 5 / 9 da cero, 5/9.0 de o,5
        //MOSTRAR RESULTADOS AL USUARIO
        System.out.println(far + "°F = " + celsius + "°C");
        System.out.println(far + "°F = " + kelvin + "°K ");
    }
    
}
