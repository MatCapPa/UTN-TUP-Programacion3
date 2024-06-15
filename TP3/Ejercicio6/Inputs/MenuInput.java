package Inputs;
import java.util.Scanner;

import modelos.BaseEmpleados;
import Inputs.AniadirEmpleadoInput;

public class MenuInput {
    public void menu(BaseEmpleados empleados) {
        Scanner entrada = new Scanner(System.in);
        boolean repetir = true;
        while (repetir) {
            System.out.println("MENU");
            System.out.println("1. Anadir un empleado");
            System.out.println("2. Eliminar un empleado");
            System.out.println("3. Mostrar empleados");
            System.out.println("4. Ver cantidad de empleados");
            System.out.println("5. Mostrar empleados por tipo (administrativo, vendedor, operario maestranza)");
            System.out.println("6. Salir");
            int op = entrada.nextInt();
            switch (op) {
                case 1:
                    AniadirEmpleadoInput aniadir = new AniadirEmpleadoInput();
                    aniadir.addEmployee(empleados);
                    break;
                case 2:
                    System.out.println("Ingrese el id del empleado a eliminar: ");
                    String id = entrada.next();
                    empleados.getEmpleados().removeIf(empleado -> empleado.getID().equals(id));
                    /*empleados.getEmpleados().forEach(empleado -> {
                        if (empleado.getID().equals(id)) {
                            empleados.getEmpleados().remove(empleado);
                        }
                    });*/
                    System.out.println("Empleado eliminado");
                    break;
                case 3:  
                    empleados.getEmpleados().forEach(empleado -> System.out.println(empleado.detalles()));               
                    break;
                case 4:
                    System.out.println("La cantidad de empleados de la emprsa: " + (empleados.getEmpleados().size()) + "\n");
                    break;
                case 5:
                    System.out.println("Ingrese el tipo de empleado a buscar: 1. Administrativo 2. Vendedor 3. Operario maestranza");
                    int tipo = entrada.nextInt();
                    String tipoBuscar = eleccion(tipo);
                    empleados.getEmpleados().forEach(empleado -> {
                        if (empleado.getTipo().equals(tipoBuscar)) {
                            System.out.println(empleado.detalles());
                        }
                    });
                    break;
                case 6:
                    repetir = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
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
