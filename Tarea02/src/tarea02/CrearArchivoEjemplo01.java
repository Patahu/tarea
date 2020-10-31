/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea02;


import java.io.File;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author patro
 */
public class CrearArchivoEjemplo01 {
    public static void main(String[] args) throws IOException {
     String saludo="Hola";
      try
      {
            File archivo=new File("ficheros/personas.dat");
       try (FileWriter escribir = new FileWriter(archivo,true)) {
                escribir.write(saludo);
               escribir.close();
             }
        }
            catch(Exception e)
        {
                System.out.println("Error al escribir");
        }
       }
}
