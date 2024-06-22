public class Sueldo extends ImprimirSaldo{
    private String rubro;
    public void imprimirResivo(Persona persona){ 
        rubro = persona.getEmpleado();
        if (rubro=="cajero") {
            ImprimirRecivoCajero(persona);
        }
        else if (rubro=="administrativo") {
            ImprimirRecivoAdministrativo(persona);
        }
        else if (rubro=="repartidor") {
            ImprimirRecivoRepartidor(persona);
        }
        else if (rubro=="vendedor") {
            ImprimirRecivoVendedor(persona);
        }
    }
}
