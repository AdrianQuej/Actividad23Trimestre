/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad23trimestre;

import java.util.Scanner;

/**
 *
 * @author Adrian Quej
 */
public class Actividad23Trimestre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       int mes;
       Scanner miConsola = new Scanner(System.in);
        System.out.println("Escribe el numero de mes del 1 al 12 para conocer en que trimestre nos encontramos: ");
        mes = miConsola.nextInt();
        
        switch  (mes){
            case 1,2,3:
                System.out.println("Nos encontramos en el primer trimestre del año");
                break;
            case 4,5,6:
                System.out.println("Nos encontramos en el segundo trimestre del año");
                break;
            case 7,8,9:
                System.out.println("Nos encontramos en el tercer trimestre del año");
                break;
            case 10,11,12:
                System.out.println("Nos encontramos en el cuarto trimestre del año");
                break;
            
            
            default:
                System.out.println("Debes escribir un numero del 1 al 12 correspondiente al mes del año");
        }
        
    }
    
}
