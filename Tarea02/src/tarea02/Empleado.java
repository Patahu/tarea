/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea02;

/**
 *
 * @author patro
 */
public class Empleado extends Persona {
    private double sueldo;
public Empleado(String nif, String nombre, int edad, double sueldo) {
super(nif, nombre, edad);
this.sueldo = sueldo;
}
public Empleado() {
}
public double getSueldo() {
return sueldo;
}
public void setSueldo(double sueldo) {
this.sueldo = sueldo;
}
}
