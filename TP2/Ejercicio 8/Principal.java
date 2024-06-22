import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Principal{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Tarjeta> setTarjetasCredito = new ArrayList<>();
        Boolean repetir = true;
        int respuesta;
        String nombre, apellido, mail, telefono, entidadFinanciera, entidadBancaria, nroTarjeta, dni,buscar_nro_tarjeta;;
        double saldo;
        while (repetir) {
            System.out.println("--------Terminal de pago--------");
            System.out.println("1. Crear tarjeta");
            System.out.println("2. Ver tarjeta");
            System.out.println("3. Abonar pago");
            System.out.println("4. Salir");
            System.out.println("--------------------------------");
            respuesta = entrada.nextInt();

            switch (respuesta) {
                case 1:
                    System.out.println("Creando tarjeta");
                    System.out.println("Datos del titular:\nNombre:");
                    nombre = entrada.next();
                    System.out.println("Apellido: ");
                    apellido = entrada.next();
                    System.out.println("DNI: ");
                    dni = entrada.next();
                    System.out.println("Mail: ");
                    mail = entrada.next();
                    System.out.println("telefono: ");
                    telefono = entrada.next();
                    System.out.println("Datos de la Tarjeta:\nEntidad Bancaria: ");
                    entidadBancaria = entrada.next();
                    System.out.println("Entidad Financiera: ");
                    entidadFinanciera = entrada.next();
                    System.out.println("Nro de Tarjeta: ");
                    nroTarjeta = entrada.next();
                    System.out.println("Ingrese Saldo: ");
                    saldo = entrada.nextDouble();
                    Tarjeta tarjeta = new Tarjeta(nombre, apellido, mail, telefono, entidadFinanciera, entidadBancaria, nroTarjeta, dni, saldo);
                    setTarjetasCredito.add(tarjeta);
                    System.out.println("Tarjeta Creada\n" + tarjeta.toString());
                    break;
                case 2: 
                    System.out.println("Ver tarjeta");
                    System.out.println("Introduzca Nro de tarjeta:");
                    buscar_nro_tarjeta = entrada.next();
                    for (Tarjeta buscar_tarjeta : setTarjetasCredito) {
                        if (buscar_tarjeta.getnroTarjeta().equals(buscar_nro_tarjeta)) {
                            System.out.println(buscar_tarjeta.toString());
                        } else{
                            System.out.println("Tarjeta no encontrada");
                        }
                    }
                    break;
                case 3:
                    double monto_abonar=0;
                    int cant_cuotas=0;
                    boolean opcion = true;
                    String elegir;
                    System.out.println("Abonando pago");
                    System.out.println("1. Pago personalizado\n2. Pago de $10.000 en 5 cuotas");
                    elegir = entrada.next();
                    while (opcion) {
                        switch (elegir) {
                            case "1":                                
                                System.out.println("Elegir un pago personalizado");
                                System.out.println("Monto a abonar: ");
                                monto_abonar = entrada.nextDouble();
                                System.out.println("Cantidad de cuotas: ");
                                cant_cuotas = entrada.nextInt();
                                opcion=false;
                                break;
                            case "2":
                                monto_abonar = 10000;
                                cant_cuotas = 5;
                                opcion=false;
                                break;    
                            default:
                                System.out.println("Opcion incorrecta.");
                                break;
                        }
                    }
                    System.out.println("Introduzca Nro de tarjeta para realizar el pago:");
                    buscar_nro_tarjeta = entrada.next();
                    for (Tarjeta buscar_tarjeta : setTarjetasCredito) {
                        if (buscar_tarjeta.getnroTarjeta().equals(buscar_nro_tarjeta)) {
                            Posnet posnet = new Posnet(cant_cuotas, monto_abonar);
                            System.out.println(posnet.efectuar_pago(cant_cuotas, monto_abonar, buscar_tarjeta.getsaldo()));
                            
                        } else{
                            System.out.println("Tarjeta no encontrada");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saliendo");
                    repetir = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
                    break;
            }
            
        }
        entrada.close();
    }
}