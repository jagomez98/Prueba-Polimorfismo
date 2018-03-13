/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapolimorfismo;

/**
 *
 * @author link_
 */
public abstract  class Empleado {
    private String nombre;
    private String apellidos;
    private String nSS;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setnSS(String nSS) {
        this.nSS = nSS;
    }

    
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getnSS() {
        return nSS;
    }

    public Empleado(String nombre, String apellidos, String nSS) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nSS = nSS;
    }
    
    @Override
    public String toString(){
        //return this.nombre+" "+this.apellidos+"\n"
             //   +"NSS: "+this.nSS+"\n";
        return String.format
        ("%s %s%nNSS: %s",
        this.nombre,this.apellidos,this.nSS);
    }   
    
    public abstract double ingresos();
    
}
