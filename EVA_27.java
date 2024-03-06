/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_27;

import java.util.Scanner;

/**
 *
 * @author sanch
 */
public class EVA_27 {

    public static void main(String[] args) {
     //Crear un arreglo de 15 elementos
     int[] arreglo = new int[15];
     //Llenarlo con valores aleaatorios entre 0 y 99
        for (int i = 0; i < arreglo.length; i++) {
           arreglo[i] = (int)(Math.random() * 100); 
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]"); 
        }
        System.out.println("");
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Que numero buscas");
        num = input.nextInt();
        //BUSQUEDA SECUENCIAL (POR FUERZA BRUTA)
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] == num) { //Valor encontrado
                System.out.print("Valor encontrado en la pocision: " + i);
                break;
            }  
        }
    }
}
