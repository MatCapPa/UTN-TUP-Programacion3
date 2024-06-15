package modelos;
public class Circle extends Shape{
    private double radio;

    public Circle(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }

    public String dibujar(){
        return "Dibujando un circulo de radio: " + radio;
    }
}
