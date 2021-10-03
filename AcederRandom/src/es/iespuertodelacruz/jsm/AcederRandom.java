/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.jsm;

import es.iespuertodelacruz.jsm.modelo.Gestor;
import es.iespuertodelacruz.jsm.modelo.Persona;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class AcederRandom {
    static RandomAccessFile archivo ;

    /**
     * @param args the command line arguments
     */
    
    static void escribir(Persona persona) throws IOException {
        
            archivo = new RandomAccessFile("Personas.dat", "rw");
            archivo.seek(archivo.length()); //el puntero se posiciona al final
            StringBuffer dnilimitado = new StringBuffer(persona.getDNI());
            dnilimitado.setLength(18);
            StringBuffer nombrelimitado = new StringBuffer(persona.getNombre());
            nombrelimitado.setLength(20);
            StringBuffer apellidolimitado = new StringBuffer(persona.getApellidos());
            dnilimitado.setLength(40);  
            archivo.writeChars(dnilimitado.toString());
            archivo.writeChars(nombrelimitado.toString());
            archivo.writeChars(apellidolimitado.toString());
            archivo.writeInt(persona.getEdad());
        
        
        
        
      
    }
    
    static boolean buscarPersona(String dni) throws IOException { 
        archivo.seek(0);
        while(archivo.getFilePointer() < archivo.length()) {
            if(archivo.readUTF().equals(dni))
                return true;
            archivo.skipBytes(64);
        }
        return false;
    }
    
    static void imprimir() throws IOException {
        archivo.seek(0);
        while(archivo.getFilePointer() < archivo.length()) {
            
            System.out.println(archivo.readUTF());
            System.out.println(archivo.readUTF());
            System.out.println(archivo.readUTF());
            System.out.println(archivo.readInt());
        }
    }

    public static void main(String[] args) throws IOException {

        
        Gestor g1 = new Gestor();
        
        for (Persona p: g1.lista) {
            escribir(p);
        }

        
        try {
            archivo = new RandomAccessFile("Personas.dat", "rw");
        
            
            
            Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.print("1. Introducir nueva Persona en el fichero\n"
                    + "2. Buscar persona\n"
                    + "3. Mostrar todos los datos guardados\n"
                    + "4. Salir\n"
                    + "Introduzca una opcion del 1 al 4: ");
            opcion = scanner.nextInt();
            System.out.println();
            switch(opcion) {
                case 1: {
                    String nombre,apellido,dni;
                    int edad;
                    System.out.print("Escriba su DNI: ");
                    dni = scanner.nextLine();
                    System.out.print("Escriba su nombre: ");
                    nombre = scanner.nextLine();
                    System.out.print("Escriba su apellido: ");
                    apellido = scanner.nextLine();
                    System.out.print("Escriba su edad: ");
                    edad = scanner.nextInt();
                    Persona nuevapersona =new Persona(dni,nombre,apellido,edad);
                    escribir(nuevapersona);
                    
                    System.out.println("Se han ingresado los datos correctamente!");
                    break;
                }
                case 2: {
                    String nombre;
                    System.out.print("Escriba el DNI que desea buscar: ");
                    nombre = scanner.next();
                    try {
                        if(buscarPersona(nombre))
                            System.out.println("Se ha encontrado el DNI en el archivo");
                        else
                            System.out.println("No se ha encontrado el DNI en el archivo");
                    } catch(IOException ex) {
                        
                    }
                    
                    break;
                }
                case 3: {
                    try {
                        imprimir();
                    } catch(IOException ex) {
                        
                    }
                    break;
                }
                default: {
                    if(opcion != 4)
                        System.out.println("Opcion no valida");
                }
            }
            System.out.println();
        } while(opcion != 4);
           
        
        } catch(IOException e) {
        }
    }
    
}
