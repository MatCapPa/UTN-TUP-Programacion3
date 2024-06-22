public class Vivienda extends Inmueble {
    private int nro_habitaciones, nro_banios;

    public Vivienda(int id, String direccion, double area,double valor_m2, int nro_habitaciones, int nro_banios) {
        super(id, direccion, area,valor_m2);
        this.nro_habitaciones = nro_habitaciones;
        this.nro_banios = nro_banios;
    }
    public int getNro_habitaciones() {
        return nro_habitaciones;
    }

    public void setNro_habitaciones(int nro_habitaciones) {
        this.nro_habitaciones = nro_habitaciones;
    }
    public int getNro_banios() {
        return nro_banios;
    }
    public void setNro_banios(int nro_banios) {
        this.nro_banios = nro_banios;
    }
    public String imprimir() {
        return(super.imprimir() 
        + "\nNro de habitaciones : " + nro_habitaciones 
        + "\nNro de banios : " + nro_banios);
    }
}
