import java.util.Scanner;

public class Principal{

    public static double calcular_Area(double area,int valor){
        return area*valor;
    }
    public static void main(String[] args) {
        //Vivienda vivienda = new Vivienda(0, 0, 0, 0, 0);
        //falta el calculo de valor por m2
        //faltan imprimir() en algunas clases
        Scanner entrada = new Scanner(System.in);
        String areas_comunes;
        int repetir = 1,id=11111;
        while (repetir < 3) {
            System.out.println("Crear el inmueble nro "+repetir+":");
            System.out.println("Crear un inmueble para uso de vivienda o uso comercial?\n1. Vivienda\n2. Comercio");
            int eleccion = entrada.nextInt();
            if (eleccion == 1) {    //Crear vivienda o comercio
                System.out.println("Creando una vivienda...");
                System.out.println("Desea crear una casa o un departamento?\n1. Casa\n2. Departamento");
                eleccion = entrada.nextInt();
                if (eleccion == 1) {    // crear casa o depto
                    System.out.println("Creando una casa...");
                    System.out.println("Desea una casa privada o independiete?\n1. Privada\n2. Independiente");
                    if (entrada.nextInt() == 1) {   //crear casa privada o independiente
                        System.out.println("Creando una casa privada...");
                        System.out.println("Direccion :");
                        String direccion = entrada.next();
                        System.out.println("Area en m2:");
                        double area = entrada.nextDouble();
                        System.out.println("Nro de habitaciones :");
                        int nro_habitaciones = entrada.nextInt();
                        System.out.println("Nro de banios :");
                        int nro_banios = entrada.nextInt();
                        System.out.println("Valor de la administracion :");
                        double valor_admin = entrada.nextDouble();
                        System.out.println("Incluye areas comunes?\n1. Si\n2. No");
                        if (entrada.nextInt() == 1) {
                            areas_comunes = "Piscina";
                        }
                        else{ areas_comunes = "No incluye areas comunes";}
                        Casas casa = new Casas(id, direccion, area,calcular_Area(area,2500000), nro_habitaciones, nro_banios, areas_comunes, valor_admin);
                        System.out.println(casa.imprimir()); 
                    }    
                    else {      //crear casa privada o independiente
                        System.out.println("Creando una casa independiente...");
                        System.out.println("Direccion :");
                        String direccion = entrada.next();
                        System.out.println("Area en m2:");
                        double area = entrada.nextDouble();
                        System.out.println("Nro de habitaciones :");
                        int nro_habitaciones = entrada.nextInt();
                        System.out.println("Nro de banios :");
                        int nro_banios = entrada.nextInt();
                        Casas casa = new Casas(id, direccion, area,calcular_Area(area,2000000), nro_habitaciones, nro_banios, "", 0);
                        System.out.println(casa.imprimir());
                    }
                } 
                else { // crear casa o depto
                    System.out.println("Creando un departamento...");
                    System.out.println("Desea un departamento familiar o un monoambiente?\n1. Familiar\n2. Monoambiente");
                    if (entrada.nextInt() == 1) {  //crar depto familiar o monoambiente
                        System.out.println("Creando un departamento familiar...");
                        System.out.println("Direccion :");
                        String direccion = entrada.next();
                        System.out.println("Area en m2:");
                        double area = entrada.nextDouble();
                        System.out.println("Nro de habitaciones :");
                        int nro_habitaciones = entrada.nextInt();
                        if (nro_habitaciones < 1) {
                            nro_habitaciones = 1;
                        }
                        System.out.println("Nro de banios :");
                        int nro_banios = entrada.nextInt();
                        System.out.println("Valor de la administracion :");
                        double valor_admin = entrada.nextDouble();
                        Apartamentos departamento = new Apartamentos(id, direccion, area,calcular_Area(area,1800000), nro_habitaciones, nro_banios, valor_admin);
                        System.out.println(departamento.imprimir());
                    }   
                    else{   //crar depto familiar o monoambiente
                        System.out.println("Creando un monoambiente...");
                        System.out.println("Direccion :");
                        String direccion = entrada.next();
                        System.out.println("Area en m2:");
                        double area = entrada.nextDouble();
                        System.out.println("Nro de banios :");
                        int nro_banios = entrada.nextInt();
                        System.out.println("Valor de la administracion :");
                        double valor_admin = entrada.nextDouble();
                        Apartamentos departamento = new Apartamentos(id, direccion, area,calcular_Area(area,1000000), 0, nro_banios, valor_admin);
                        System.out.println(departamento.imprimir());
                    }    
                }   
            }
            else {     //Crear vivienda o comercio
                System.out.println("Creando un comercio...");
                System.out.println("Desea crear una oficia o un local?\n1. Oficina\n2. Local");
                eleccion = entrada.nextInt();
                if (eleccion == 1) {     //crear oficina o local comercial
                    System.out.println("Creando una oficina...");
                    System.out.println("Direccion :");
                    String direccion = entrada.next();
                    System.out.println("Area en m2:");
                    double area = entrada.nextDouble();               
                    Oficina oficina = new Oficina(id, direccion, area,calcular_Area(area,2400000));
                    System.out.println(oficina.imprimir());
                }
                else { //crear oficina o local comercial
                    String centro_comercial="";
                    System.out.println("Creando un local comercial...");
                    System.out.println("Direccion :");
                    String direccion = entrada.next();
                    System.out.println("Area en m2:");
                    double area = entrada.nextDouble();
                    System.out.println("Localizacion: ");
                    String localizacion = entrada.next();
                    System.out.println("Esta en un centro comercial?\n1. Si\n2. No");
                    if (entrada.nextInt() == 1) {
                        centro_comercial = "BBPS";
                    } 
                    else {
                        centro_comercial = "No se encuentra en un centro comercial";
                    }
                    Local_comercial local = new Local_comercial(id, direccion, area, calcular_Area(area, 3000000), localizacion, centro_comercial);
                    System.out.println(local.imprimir());
                }
            }
            id++;
            repetir++;
        }
        entrada.close();
    }
}