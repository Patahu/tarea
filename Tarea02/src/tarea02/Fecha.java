/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea02;

import java.io.Serializable;

/**
 *
 * @author patro
 */
public class Fecha  implements Serializable{
    private int dia;
private int mes;
private int año;
public Fecha(int dia, int mes, int año) {
this.dia = dia;
this.mes = mes;
this.año = año;
}
public Fecha() {
}
public int getAño() {
return año;
}
public void setAño(int año) {
this.año = año;
}
public int getDia() {
return dia;
}
public void setDia(int dia) {
this.dia = dia;
}
public int getMes() {
return mes;
}
public void setMes(int mes) {
this.mes = mes;
}
}
