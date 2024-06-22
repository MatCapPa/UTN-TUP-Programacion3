public class Inmueble {
    private int id;
    private String direccion;
    private double area,valor_m2;

    public Inmueble(int id, String direccion, double area, double valor_m2) {
        this.id = id;
        this.direccion = direccion;
        this.area = area;
        this.valor_m2 = valor_m2;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public double getValor_m2() {
        return valor_m2;
    }
    public void setValor_m2(double valor_m2) {
        this.valor_m2 = valor_m2;
    }

    public String imprimir() {
        return("Id: "+id 
        + "\nDireccion: " + direccion 
        + "\nArea: " + area +" m2"
        + "\nValor por metro cuadrado: $ " + valor_m2);
    }
}
