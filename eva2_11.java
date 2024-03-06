
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sanch
 */
public class eva2_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int talla;
        Scanner input = new Scanner(System.in);

           System.out.println("Introduce la talla");
           talla = input.nextInt();
           //if((mes > 0)&& (mes < 13)){ //((mes > 1) && (mes < 12))
           
            switch(talla){
                case 29:
                System.out.println("small");
                    break;
                case 42:
                System.out.println("medium"); 
                break;
                case 44:
                System.out.println("large "); 
                break;
                case 48:
                System.out.println("xlarge");
                break;                
                default: 
                System.out.print("La calificacion no es valida");
            }
    }
    
}
