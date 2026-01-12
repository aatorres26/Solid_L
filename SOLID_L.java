/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solid_l;
import java.util.*;
/**
 *
 * @author User
 */
public class SOLID_L {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner (System.in);
        Militar militar= null;
        System.out.println("Ingrese una opcion");
        System.out.println("1: cabo");
        System.out.println("2: Sargento");
        System.out.println("3: Suboficial");
        System.out.println("4: Soldado");
        int op= sc.nextInt(); sc.nextLine();
        switch(op){
            case 1:
                militar= new CalculoCabo(); break;
            case 2:
                militar = new CalculoSargento(); break;
            case 3:
                militar = new CalculoSuboficial(); break;
            case 4:
                militar = new CalculoSoldado(); break;
            default:
                System.out.println("Opcion no valida");
            
            
        }
        militar.ingresarMilitar();
       
        
        if(militar instanceof MostrarDatos md){
            md.mostrar();
        }
         
    }
    
}
