/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * @author Estudiante
 */
public class Empleado {
    
    public String nombre;
    public String cedula;
    public int salxhora;
    public int horas;

    public Empleado(String nombre, String cedula, int salxhora, int horas) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.salxhora = salxhora;
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", cedula=" + cedula + ", salxhora=" + salxhora + ", horas=" + horas + '}';
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the salxhora
     */
    public int getSalxhora() {
        return salxhora;
    }

    /**
     * @param salxhora the salxhora to set
     */
    public void setSalxhora(int salxhora) {
        this.salxhora = salxhora;
    }

    /**
     * @return the horas
     */
    public int getHoras() {
        return horas;
    }

    /**
     * @param horas the horas to set
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }
    
     public float Salario(){
        float sal = getSalxhora() * getHoras();
        return sal;
    }
     
     

    
}
