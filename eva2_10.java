
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sanch
 */
public class eva2_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa;
        Scanner input = new Scanner(System.in);

           System.out.println("Introduce la calificacion");
           califa = input.nextInt();
           //if((mes > 0)&& (mes < 13)){ //((mes > 1) && (mes < 12))
           
            if((califa >= 90) && (califa <= 101))
                System.out.println("A");   
            else if((califa >= 80) && (califa <= 90))
                System.out.println("B");            
            else if((califa >= 70) && (califa <= 80))
                System.out.println("c");               
            else if((califa >= 60) && (califa <= 70))
                System.out.println("D");                
            else if((califa >= 0) && (califa <= 60))
                System.out.println("F");
            else 
                System.out.print("La calificacion no es valida");
            
                
                

                   
        }
    }
    
