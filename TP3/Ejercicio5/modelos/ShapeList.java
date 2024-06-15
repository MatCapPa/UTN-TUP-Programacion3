package modelos;
import java.util.ArrayList;
import java.util.List;

public class ShapeList {
    private List<Shape> figuras = new ArrayList<Shape>();

    public void addShape(Shape shape) {
        figuras.add(shape);
    }

    public List<Shape> getFiguras() {
        return figuras;
    }
}
