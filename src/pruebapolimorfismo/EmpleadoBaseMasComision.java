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
public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    private double salarioBase;

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public EmpleadoBaseMasComision(double salarioBase,
            String nombre, String apellidos, 
            String nSS, double ventasBrutas, 
            double tarifaPorComision) {
        super(nombre, apellidos, nSS,
               ventasBrutas, tarifaPorComision);
        this.salarioBase = salarioBase;
    }
    
    @Override
    public double ingresos(){
        return this.salarioBase+
        (this.tarifaPorComision
                *this.ventasBrutas);
    }
    
    @Override
    public String toString(){
        return String.format
    ("%s %s; %s: $%,.2f",
          "con salario base ",super.toString(),
          "salario base",
          this.salarioBase);
    }
    
}
