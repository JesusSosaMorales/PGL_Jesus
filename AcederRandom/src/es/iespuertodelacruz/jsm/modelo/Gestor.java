package es.iespuertodelacruz.jsm.modelo;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 *
 * @author jesus
 */
public class Gestor {
    public ArrayList<Persona> lista = new ArrayList<>();
    private static RandomAccessFile archivo; 
    
    public Gestor() {
        Persona p1 = new Persona ("49785427H","Lucia","Perez",20);
        Persona p2 = new Persona ("12345678A","Manuel","Alvarez",50);
        Persona p3 = new Persona ("57894785V","Pablo","Diaz",28);
        Persona p4 = new Persona ("45789648N","Angel","Hernandez",33);
        Persona p5 = new Persona ("47854878E","Maria","Garcia",18);
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);
        
    }



    public static RandomAccessFile getArchivo() {
        return archivo;
    }

    public static void setArchivo(RandomAccessFile archivo) {
        Gestor.archivo = archivo;
    }


    public ArrayList<Persona> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Persona> lista) {
        this.lista = lista;
    }
    
    
    
    
    
    
    
    
}
