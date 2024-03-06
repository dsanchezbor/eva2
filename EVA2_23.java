/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sanch
 */
public class EVA2_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DELCARAR EL ARREGLO = CREACION DEL ARREGLO
        int[] arreglo = new int[10];
        //COMO SE USA EL ARREGLO, EL ACCESO ES POR INDICES
        //EL PRIMER ELEMENTO DEL ARREGLO ESTA EN LA POSICION 0 (CERO)
        //ULTIMO ELEMENTO ES N - 1, N ES EL TAMANO DEL ARREGLO
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        
        System.out.println(arreglo[9]);
        ///
        String[] arregloCade = new String[5];
        arregloCade[0] = "Hola";
        arregloCade[1] = "";
        arregloCade[2] = "Mundo";
        arregloCade[3] = "";
        arregloCade[4] = "Cruel";
        System.out.println(arregloCade[0]);
        System.out.println(arregloCade[1]);
        System.out.println(arregloCade[2]);
        System.out.println(arregloCade[3]);
        System.out.println(arregloCade[4]);
        
    }
    
}
