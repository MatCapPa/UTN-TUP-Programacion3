
public class Auto {
    private String marca, patente;
    private int modelo;
    private Motor motor;

    public Auto (String marca, String patente, int modelo, Motor motor) {
        this.marca = marca;
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }
    @Override
    public String toString() {
        return "Patente: " + patente + "\nMarca: " + marca + "\nModelo: " + modelo + "\n" + motor;
    }
}