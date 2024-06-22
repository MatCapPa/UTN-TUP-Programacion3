public class Oficina extends Comercio{
    
    public Oficina( int id, String direccion, double area,double valor_m2) {
        super(id, direccion, area,valor_m2);
    }
    public String imprimir(){
        return(super.imprimir());
    }
}
