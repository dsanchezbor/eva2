/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_26;

import java.util.Scanner;

/**
 *
 * @author sanch
 */
public class EVA2_26 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String [] platillos = new String[10];
        platillos[0] = "Tacos";
        platillos[1] = "Torta de lomo";
        platillos[2] = "Hamburgesas";
        platillos[3] = "Burritos";
        platillos[4] = "Boneless";
        platillos[5] = "Pizza";
        platillos[6] = "Sushi";
        platillos[7] = "Carne asada";
        platillos[8] = "Banderillas";
        platillos[9] = "Quesadillas";
        double[] precio = {50, 65, 70, 35, 80, 100, 125, 160, 35, 30};
        
        System.out.println("--------Menú-------");
        for (int i = 0; i < platillos.length; i++) {
            System.out.println(i + "- " + platillos[i] + ": $" + precio[i]);
            
        }
        int opc, cant;
        Scanner input = new Scanner(System.in);
        System.out.println("Que quieres ordenar?");
        opc = input.nextInt();
        System.out.println("Cuantas ordenes quieres?");
        cant = input.nextInt();
        System.out.println("El costo de tu pedido es: $" + (cant * precio[opc]));
    }
}
