/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea02;

import java.io.BufferedReader;
import java.io.FileReader;

public class LecturaDeArchivo {
    public static void main(String[] args) {
        String texto="";
        try
        {
        FileReader lector=new FileReader("texto.txt");
        BufferedReader contenido=new BufferedReader(lector);
        while((texto=contenido.readLine())!=null)
    {
    System.out.println(texto);
    }
    }
        catch(Exception e)
    {
        System.out.println("Error al leer");
    }
    }
}
