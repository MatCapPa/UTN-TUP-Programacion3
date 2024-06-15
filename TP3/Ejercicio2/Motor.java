public class Motor {
    private int nroMotor;
    private double kilometraje;
    private String cilindrada; //nafta,aceite,disel

    public Motor (String cilindrada, int nroMotor, double kilometraje) {
        this.cilindrada = cilindrada;
        this.nroMotor = nroMotor;
        this.kilometraje = kilometraje;
    }
    @Override
    public String toString() {
        return super.toString() + "\nCilindrada: " + cilindrada + "\nNro de motor: " + nroMotor + "\nKilometraje: " + kilometraje;
    }
}
