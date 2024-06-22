import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        /*Persona persona_vendedor = new Persona("Juan Perez","12345678","Coronel Rodriguez 123", "2020", "vendedor", 65000);
        Persona persona_cajero = new Persona("Pedro Perez","12345678","Juan Pujol 123", "2020", "cajero", 65000);
        Persona persona_administrativo = new Persona("Maria Perez","12345678","Elefante Aficano 123", "2020", "administrativo", 65000);
        Persona persona_repartidor = new Persona("Luis Perez","12345678","Calle Solitaria 123", "2020", "repartidor", 65000);
        */
        Sueldo mostrar = new Sueldo(); 
        Scanner entrada = new Scanner(System.in);
        String nombre,dni,domicilio,fecha_ingreso,jornada_laboral;
        double sueldo,ventas_mesuales,sueldo_basico=650000;
        int respuesta,repartos_mensuales;
        boolean repetir = true;
        while (repetir) {
            System.out.println("¿Cual es su puesto?");
            System.out.println("1. Vendedor\n"+
                                "2. Cajero\n"+
                                "3. Administrativo\n"+
                                "4. Repartidor\n"); 
            respuesta = entrada.nextInt();
            switch (respuesta) {
                case 1:
                    double calculo_ventas_mesuales;
                    System.out.println("Vendedor");
                    System.out.println("Nombre:");
                    nombre = entrada.next();
                    System.out.println("DNI:");
                    dni = entrada.next();
                    System.out.println("Domicilio:");
                    domicilio = entrada.next();
                    System.out.println("Fecha de Ingreso:");
                    fecha_ingreso = entrada.next();
                    System.out.println("Ventas mensuales:");
                    ventas_mesuales = entrada.nextDouble();
                    calculo_ventas_mesuales = 0.005 * ventas_mesuales;
                    sueldo = sueldo_basico + calculo_ventas_mesuales;
                    Persona vendedor = new Persona(nombre,dni,domicilio,fecha_ingreso,"vendedor",sueldo,"",0,0);
                    mostrar.imprimirResivo(vendedor);
                    repetir = false;
                    break;
                case 2:
                    System.out.println("Cajero");
                    System.out.println("Nombre:");
                    nombre = entrada.next();
                    System.out.println("DNI:");
                    dni = entrada.next();
                    System.out.println("Domicilio:");
                    domicilio = entrada.next();
                    System.out.println("Fecha de Ingreso:");
                    fecha_ingreso = entrada.next();
                    Persona cajero = new Persona(nombre,dni,domicilio,fecha_ingreso,"cajero",sueldo_basico,"",0,0);
                    mostrar.imprimirResivo(cajero);
                    repetir = false;
                    break;
                case 3:
                    System.out.println("Administrativo");
                    System.out.println("Nombre:");
                    nombre = entrada.next();
                    System.out.println("DNI:");
                    dni = entrada.next();
                    System.out.println("Domicilio:");
                    domicilio = entrada.next();
                    System.out.println("Fecha de Ingreso:");
                    fecha_ingreso = entrada.next();
                    System.out.println("Jornada laboral:\n1.Jornada completa\n2.Jornada parcial");
                    respuesta = entrada.nextInt();
                    if (respuesta == 1) {
                        jornada_laboral = "Jornada completa";
                        sueldo = sueldo_basico + (5000 * 30);  //cobra 5000 por dia
                    } else {
                        jornada_laboral = "Jornada parcial";
                        sueldo = sueldo_basico + (2500 * 30); //cobra 2500 por dia
                    }
                    Persona administrativo = new Persona(nombre,dni,domicilio,fecha_ingreso,"administrativo",sueldo,jornada_laboral,0,0);
                    mostrar.imprimirResivo(administrativo);
                    repetir = false;
                    break;
                case 4:
                    int extra;
                    System.out.println("Repartidor");
                    System.out.println("Nombre:");
                    nombre = entrada.next();
                    System.out.println("DNI:");
                    dni = entrada.next();
                    System.out.println("Domicilio:");
                    domicilio = entrada.next();
                    System.out.println("Fecha de Ingreso:");
                    fecha_ingreso = entrada.next();
                    System.out.println("Repartos mensuales:");
                    repartos_mensuales = entrada.nextInt();
                    extra = repartos_mensuales *500;
                    sueldo = sueldo_basico + extra;
                    Persona repartidor = new Persona(nombre,dni,domicilio,fecha_ingreso,"repartidor",sueldo_basico,"",0,extra);
                    mostrar.imprimirResivo(repartidor);
                    repetir = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
        entrada.close();
    }
}
