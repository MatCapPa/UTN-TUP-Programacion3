import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private List<Habitacion> habitaciones = new ArrayList<>();

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }
}
