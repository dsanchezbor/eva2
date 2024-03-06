
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
        String carrera;
        Scanner input = new Scanner(System.in);
        carrera = input.next();
        
        switch(carrera){
            case "ISC":
                System.out.println("Ingenieria en sistemas computacionales ");
                break;
            case "INF":
                System.out.println("Ingenieria informatica");
            break;
            default:
                System.out.println("No existe");
                
        

            }
    }
    
}
