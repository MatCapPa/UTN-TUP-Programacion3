public class Posnet {
    private int cantidad_cuotas;
    private double monto_a_pagar;
    public Posnet(int cantidad_cuotas, double monto_a_pagar){
        this.cantidad_cuotas = cantidad_cuotas;
        this.monto_a_pagar = monto_a_pagar;
    }
    public int getCantidad_cuotas() {
        return cantidad_cuotas;
    }
    public double getmonto_a_pagar() {
        return monto_a_pagar;
    }
    public void setmonto_a_pagar(double monto_a_pagar) {
        this.monto_a_pagar = monto_a_pagar;
    }
    public void setCantidad_cuotas(int cantidad_cuotas) {
        this.cantidad_cuotas = cantidad_cuotas;
    }

    public String efectuar_pago(int cantidad_cuotas, double monto_a_pagar, double saldo){
        double recargo;
        if (cantidad_cuotas > 1){
            recargo = (((double)cantidad_cuotas * 3)/100) +1;
            monto_a_pagar = monto_a_pagar * recargo;
            if (monto_a_pagar > saldo){
                return "No se puede realizar el pago\nMonto a pagar: "+monto_a_pagar+"\nSaldo en la tarjeta: "+(saldo);
            }
            else{
                return "El pago se realizo con exito\nMonto a pagar: "+monto_a_pagar+"\nSaldo: "+(saldo-monto_a_pagar);
            }    
        }
        else{
            if (monto_a_pagar > saldo){
                return "No se puede realizar el pago\nMonto a pagar: "+monto_a_pagar+"\nSaldo en la tarjeta: "+(saldo);
            }
            else{
                return "El pago se realizo con exito\nMonto a pagar: "+monto_a_pagar+"\nSaldo: "+(saldo-monto_a_pagar);
            } 
        }
    }
    

}
