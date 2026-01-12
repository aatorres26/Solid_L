/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid_l;
import java.util.*;
/**
 *
 * @author User
 */
public class CalculoSargento extends Militar implements ICalcularSalario , MostrarDatos {
    Scanner sc= new Scanner (System.in);
    @Override
    public double calcularSalario() {
        return semanas * 90;
    }

   

    @Override
    public void mostrar() {
        System.out.println("======REPORTE DE EMPLEADO=======");
        System.out.println("Nombre: "+nombre);
        System.out.println("especialidad: "+especialidad);
        System.out.println("Salario: "+ calcularSalario());
    }

    @Override
    public void ingresarMilitar() {
        System.out.println("Ingrese el nombre del militar: ");
        nombre= sc.nextLine();
        System.out.println("Ingrese su especialidad: ");
        especialidad= sc.nextLine();
        System.out.println("Ingrese las semanas activo:");
        semanas= sc.nextInt();
        sc.nextLine();
    }
    
}
