/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_10;

/**
 *
 * @author sanch
 */
public class Ejercicio_10 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
          Scanner keyboard = new Scanner(System.in);
        String string;
        
        System.out.println("Ingrese una cadena: ");
        string = keyboard.nextLine();
        
        if (isNumeric(string)) {
            System.out.println("Es un numero válido.");
        } else {
            System.out.println("No es numero válido");
        }
    
    
    public static boolean isNumeric(String c) {
        boolean r;

        try {
            Integer.parseInt(c);
            r = true;
        } catch (NumberFormatException excepcion) {
            r = false;
        }
    
        return r;
       
        }
    }
    

