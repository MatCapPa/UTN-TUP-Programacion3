package Inputs;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

import modelos.BaseEmpleados;
import modelos.empleados.Administrativo;
import modelos.empleados.OperarioMaestranza;
import modelos.empleados.Vendedor;

public class AniadirEmpleadoInput {
    public void addEmployee(BaseEmpleados empleados) {
        Scanner entrada = new Scanner(System.in);
        
        
            
            System.out.println("Aniadir empleado");
            System.out.println("1. Aniadir administrativo");
            System.out.println("2. Aniadir vendedor");
            System.out.println("3. Aniadir operario maestranza");
            int op = entrada.nextInt();

            String tipo = eleccion(op);
            System.out.println("Ingrese el Nombre: ");
            String nombre = entrada.next();
            System.out.println("Ingrese el Apellido: ");
            String apellido = entrada.next();
            System.out.println("Ingrese la Edad: ");
            int edad = entrada.nextInt();
            System.out.println("Ingrese el Sueldo: ");
            double sueldo = entrada.nextDouble();
            System.out.println("Ingrese el Fecha de ingreso(yyyy-mm-dd): ");
            LocalDate fechaIngreso = LocalDate.parse(entrada.next());
            Random random = new Random();
            String id = String.valueOf(random.nextInt(1000));  
            switch(op){
                case 1:
                    empleados.addEmpleado(new Administrativo(tipo, nombre, id, apellido, edad, fechaIngreso, sueldo));
                    System.out.println("Empleado aniadido con id: "+ id);
                    break;
                case 2:
                    empleados.addEmpleado(new Vendedor(tipo, nombre, id, apellido, edad, fechaIngreso, sueldo));
                    System.out.println("Empleado aniadido con id: "+ id);
                    break;
                case 3:
                    empleados.addEmpleado(new OperarioMaestranza(tipo, nombre, id, apellido, edad, fechaIngreso, sueldo));
                    System.out.println("Empleado aniadido con id: "+ id); 
                    break;
            }  
        
    }

    private String eleccion(int op){
        if (op == 1) 
        {
            return "Administrativo";
        } else if (op == 2) 
        {
            return "Vendedor";
        } else if (op == 3) 
        {
            return "Operario maestranza";
        }
        return "Vendedor"; //esto es para que no de error
    }
}
