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
public class CalculoSuboficial extends Militar implements ICalcularSalario, MostrarDatos{
Scanner sc= new Scanner (System.in);
    

    @Override
    public void mostrar() {
        System.out.println("======REPORTE DE EMPLEADO=======");
        System.out.println("Nombre: "+nombre);
        System.out.println("especialidad: "+especialidad);
        System.out.println("salario: "+calcularSalario());
    }

    @Override
    public void ingresarMilitar() {
         System.out.println("Ingrese el nombre del docente");
        nombre= sc.nextLine();
        System.out.println("Ingrese su especialidad");
        especialidad= sc.nextLine();
        System.out.println("Ingrese las semanas activo ");
        semanas= sc.nextInt();
        sc.nextLine();
    }

    @Override
    public double calcularSalario() {
        return semanas*100;
    }
    
}
