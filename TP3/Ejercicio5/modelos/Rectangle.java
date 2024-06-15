package modelos;
public class Rectangle extends Shape{
    private double base;
    private double altura;

    public Rectangle(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase(){
        return base;
    }

    public void setBase(double base){
        this.base = base;
    }
    
    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }
    public String dibujar(){
        return "Dibujando un rectangulo de base: " + base + " y altura: " + altura;
    }
}
