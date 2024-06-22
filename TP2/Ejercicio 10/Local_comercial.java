public class Local_comercial extends Comercio{
    private String localizacion, centro_comercial;
    public Local_comercial(int id, String direccion, double area,double valor_m2, String localizacion, String centro_comercial) {
        super(id, direccion, area,valor_m2);
        this.localizacion = localizacion;
        this.centro_comercial = centro_comercial;
    }
    public String getLocalizacion() {
        return localizacion;
    }
    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }
    public void setCentro_comercial(String centro_comercial) {
        this.centro_comercial=centro_comercial;
    }
    public String getCentro_comercial() {
        return centro_comercial;
    }
    public String imprimir(){
        return(super.imprimir() 
        + "\nLocalizacion: " + localizacion 
        + "\nCentro Comercial: " + centro_comercial);
    }
}
