public class Casas extends Vivienda{
    private String areas_comunes;
    private double valor_de_la_admin;

    public Casas(int id, String direccion, double area,double valor_m2, int nro_habitaciones, int nro_banios, String areas_comunes, double valor_de_la_admin) {
        super(id, direccion, area,valor_m2, nro_habitaciones, nro_banios);
        this.areas_comunes = areas_comunes;
        this.valor_de_la_admin = valor_de_la_admin;
    }
    public String getAreas_comunes() {
        return areas_comunes;
    }
    public void setAreas_comunes(String areas_comunes) {
        this.areas_comunes = areas_comunes;
    }
    public double getvalor_de_la_admin() {
        return valor_de_la_admin;
    }
    public void setvalor_de_la_admin(double valor_de_la_admin) {
        this.valor_de_la_admin = valor_de_la_admin;
    }
    public String imprimir() {
        return (super.imprimir() 
        + "\nAreas comunes:" + areas_comunes 
        + "\nValor de la administracion: $ " + valor_de_la_admin);
    }
}
