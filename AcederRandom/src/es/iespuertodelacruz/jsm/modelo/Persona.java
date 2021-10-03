/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.jsm.modelo;

/**
 *
 * @author jesus
 */

/*
Cada tipo de variable ocupa un numero de bytes.
Long: 8 bytes
Integer: 4 bytes
Short: 2 bytes
Byte: 1 byte
Double: 8 bytes
Float: 4 bytes
Boolean: 1 byte
Char: 2 bytes
String: 2 bytes por cada caracter.


DNI  +  Nombre  +  Apellidos  +  edad    TOTAL
18   +  20      +  40         +  4       =  82

*/




public class Persona {
    String DNI;
    String nombre; 
    String apellidos;
    int edad;

    public Persona() {
    }

    public Persona(String DNI,String nombre, String apellidos,  int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
}