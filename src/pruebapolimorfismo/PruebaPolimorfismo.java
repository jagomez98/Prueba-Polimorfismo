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
public class PruebaPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmpleadoAsalariado empleadoAsalariado = 
                new EmpleadoAsalariado("Carlos",
                "Pano","1234-2345",20000.00);
        EmpleadoPorHoras empleadoPorHoras =
                new EmpleadoPorHoras("Angel","Ramirez"
                 ,"0000-1111",200.00,60.00);
        EmpleadoPorComision empleadoPorComision=
                new EmpleadoPorComision("Maggie",
                "Simpson","1234-000",30000,0.20);
        EmpleadoBaseMasComision empleadoBaseMasComision=
                new EmpleadoBaseMasComision(3000.00,"Pepito",
                "Hernandez","0101-0101",50000,0.15);
        System.out.println("Empleados procesados "
                + "independientemente");
        System.out.printf("%n%s%n%s: $%,.2f",
                empleadoAsalariado,"ingresos",
                empleadoAsalariado.ingresos());
        System.out.printf("%n%s%n%s: $%,.2f",
                empleadoPorHoras,"ingresos",
                empleadoPorHoras.ingresos());
        System.out.printf("%n%s%n%s: $%,.2f",
                empleadoPorComision,"ingresos",
                empleadoPorComision.ingresos());
        System.out.printf("%n%s%n%s: $%,.2f",
                empleadoBaseMasComision,"ingresos",
                empleadoBaseMasComision.ingresos());
        
        Empleado [] empleados;
        empleados= new Empleado[4];
        
        
        empleados[0]=empleadoAsalariado;
        empleados[1]=empleadoPorHoras;
        empleados[2]=empleadoPorComision;
        empleados[3]=empleadoBaseMasComision;
        System.out.println("\n****************");
        for(Empleado empleadoActual : empleados){
            System.out.println(empleadoActual);
        }
        
    }
    
}
