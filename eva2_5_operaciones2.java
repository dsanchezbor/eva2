/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sanch
 */
public class eva2_5_operaciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hee
        int var1, var2, resu;
    
    var1 = 100;
    var2 = 200;
    
    
    //operador +
    //suma
    //concatenar --> unir cadenas de texto
    
    resu = var1 + var2;
    
           System.out.println("var1 = " + var1);
           System.out.println("var2 = " + var2);
           System.out.println("var 1 + var2 = " + resu);
    //resta
    //operador - 
           
    resu = var1 - var2;
           System.out.println(); //salto de linea
           System.out.println("var1 = " + var1);
           System.out.println("var2 = " + var2);
           System.out.println("var1 - var2 " + resu);
    //multiplicacion
    //operador *
    
    resu= var1 * var2; 
            System.out.println();
            System.out.println("var1 = " + var1);
            System.out.println("var2 = " + var2);
            System.out.println("var1 X var2 " + resu);
    //division
    //operador /
    // ojo: el tipo de dato es inmportante, si quieren
    //el resultado de uan division, hay que manejarlo flotant
    //si lo manejan entero, les dara el # de veces que cave el
    // divisor en el dividendo  (de forma entrea)
    var1 = 15;
    var2 = 7;
    resu= var1 / var2; 
            System.out.println();
            System.out.println("var1 = " + var1);
            System.out.println("var2 = " + var2);
            System.out.println("var1 / var2 " + resu);
            
    //division flotante
            double resuExacto;
            resuExacto = var1 / var2;
            
            System.out.println();
            System.out.println("var1 = " + var1);
            System.out.println("var2 = " + var2);
            System.out.println("var1 / var2 " + resuExacto);
            
            double var2f = 7;

            
            int cifra = 7;
            double cifraDouble = 7.0;//se toma el divisor como entero
            //double divisiom = 100 / 10.0; //se toma el divisor como flotante
            
            //precedencia de operaciones 
            int a = 5, b = 3, c = 2;
                    int resultado = (a * b) + (a - c) * (b - a);//(15)+(3)*(-2)// 15-6 + 9
                    System.out.println("resultado precedencia: " + resultado);
                    
            //potencias y raices
                    double potencia;
                    potencia = Math.pow(5, 3);
                    System.out.println("potencia = " + potencia);
                    
            //raiz
                    potencia = Math.pow(100, 0.5);
                    System.out.println("potencia = " + potencia);
    }
    
}
