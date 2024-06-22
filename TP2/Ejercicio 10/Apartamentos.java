public class Apartamentos extends Vivienda{
    private double valor_admin;
    public Apartamentos(int id, String direccion, double area,double valor_m2, int nro_habitaciones, int nro_banios, double valor_admin) {
        super(id, direccion, area,valor_m2, nro_habitaciones, nro_banios);
        this.valor_admin = valor_admin;
    }
    public double getValor_admin() {
        return valor_admin;
    }
    public void setValor_admin(double valor_admin) {
        this.valor_admin = valor_admin;
    }
    public String imprimir() {
        return(super.imprimir()+ "\nValor de la administracion: $ " + valor_admin);
    }
}
