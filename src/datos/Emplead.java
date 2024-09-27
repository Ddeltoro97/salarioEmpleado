/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Emplead {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        String cedula;
        int salxhora;
        int horas;
        int salxmes;
        String salxMesString;
        
        nombre = JOptionPane.showInputDialog("Escriba el nombre del empleado");
        cedula = JOptionPane.showInputDialog("Digite cédula del empleado");
        horas = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas este mes"));
        salxhora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario de este empleado por hora"));
        
        salxmes = calcularSalario(salxhora, horas);
        salxMesString = Integer.toString(salxmes);
        
        JOptionPane.showMessageDialog(null, "El nombre del empleado es: " + nombre + "\n" + "La cc del empleado es: " + cedula + "\n" + "Este empleado mensual tiene un sueldo de: " +salxMesString);
    }
    
    private static int calcularSalario(int salxhora, int horas){
        return salxhora * horas;
    }
    
}
