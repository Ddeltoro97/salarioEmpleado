/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testing;

import datos.Empleado;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class Testing {
    public static void main(String [] args){
        String name = JOptionPane.showInputDialog("Escriba el nombre del empleado");
        String cedula = JOptionPane.showInputDialog("Digite cédula del empleado");
        int salxhora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario de este empleado por hora"));
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas este mes"));
        Empleado e = new Empleado(name, cedula, salxhora, horas);
        System.out.println("El empleado " + e.nombre + " con CC " + e.cedula + " su salario es: " + e.Salario());
    }
    
}
