/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EVA1_4_captura;

import java.util.Scanner;

/**
 *
 * @author jahaziel
 */
public class EVA1_4_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SI VAMOS A USAR VARIABLES, SE TIENE QUE "DECLARAR" ANTES DE USAR
        //DECLARAR --> CREAR LA VARIABLE PARA SU USO EN EL PROGRAMA
        //TIPO_DATO NOMBRE_IDENTIFICADOR
        //USAR NOMBRES SIGNIFICATIVOS --> DBE DECIR PARA QUE SE USA
        String nombre;//declaracion de la variable
        System.out.println("captura el nombre;");
        //ENTRADA DE DATOS DEL TECLADO (JAVA)
        Scanner captu = new Scanner(System.in); //otra variable --> captu de tipo de Scanner 
        //captura  del teclado y ponerlo en ia variable nombre 
        //escribir en la variable (poner un valor) ASIGNACION 
        nombre = captu.nextLine();
        System.out.println("tu nombre es ");
        System.out.println(nombre);
        
    }
        
    
}
