public class ImprimirSaldo{
    public void ImprimirRecivoVendedor(Persona persona){
        System.out.println(
            "Nomrbre: "+persona.getNombre()+ "\n" 
            +"DNI: "+persona.getDni()+ "\n"
            +"Domicilio: "+persona.getDomicilio()+ "\n"
            +"Fecha de Ingreso: "+persona.getFecha_ingreso()+ "\n"
            +"Categoria: "+persona.getEmpleado()+ "\n"
            +"Sueldo basico: $650000.0"+ "\n"
            +"Comisiones por venta: $"+(persona.getSueldo()-650000)+ "\n"
            +"Total a cobrar: $"+(persona.getSueldo()));
    }
    public void ImprimirRecivoCajero(Persona persona){
        System.out.println(
            "Nomrbre: "+persona.getNombre()+ "\n" 
            +"DNI: "+persona.getDni()+ "\n"
            +"Domicilio: "+persona.getDomicilio()+ "\n"
            +"Fecha de Ingreso: "+persona.getFecha_ingreso()+ "\n"
            +"Categoria: "+persona.getEmpleado()+ "\n"
            +"Sueldo basico: $650000.0");
    }
    public void ImprimirRecivoAdministrativo(Persona persona){
        System.out.println(
            "Nomrbre: "+persona.getNombre()+ "\n" 
            +"DNI: "+persona.getDni()+ "\n"
            +"Domicilio: "+persona.getDomicilio()+ "\n"
            +"Fecha de Ingreso: "+persona.getFecha_ingreso()+ "\n"
            +"Categoria: "+persona.getEmpleado()+ "\n"
            +"Sueldo basico: $650000.0"+ "\n"
            +"Jornada laboral: "+persona.getJornada_laboral()+ "\n"
            +"Total a cobrar: $"+persona.getSueldo());
    }
    public void ImprimirRecivoRepartidor(Persona persona){
        System.out.println(
            "Nomrbre: "+persona.getNombre()+ "\n" 
            +"DNI: "+persona.getDni()+ "\n"
            +"Domicilio: "+persona.getDomicilio()+ "\n"
            +"Fecha de Ingreso: "+persona.getFecha_ingreso()+ "\n"
            +"Categoria: "+persona.getEmpleado()+ "\n"
            +"Sueldo basico: $650000.0"+ "\n"
            +"Cobro por repartos: $"+persona.getRepartos_extra()+ "\n"
            +"Total a cobrar: $"+persona.getSueldo());
    }
}
