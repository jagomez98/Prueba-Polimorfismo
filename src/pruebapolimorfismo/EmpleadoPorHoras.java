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
public class EmpleadoPorHoras extends Empleado{
    private double sueldo;
    private double horas;

    public EmpleadoPorHoras(String nombre,
     String apellidos, String nSS,double sueldo,
     double horas) {
        super(nombre, apellidos, nSS);
        this.sueldo=sueldo;
        this.horas=horas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public double getHoras() {
        return horas;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    @Override
    public double ingresos() {
        if(horas<=40){
            return horas*sueldo;
        }else if(horas>40){
            return (40*sueldo)+(horas-40)*sueldo*1.5;
        }
        return 0;        
    }
    
    @Override
    public String toString(){
        return String.format
    ("empleado por horas: %s%n%s: $%,.2f%n%s: %.2f",
          super.toString(),"sueldo por hora",
          this.sueldo,"Horas trabajadas",
          this.horas);
    }
    
    
    
}
