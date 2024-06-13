import java.util.ArrayList;
import java.util.List;

public class ManejoDeTareas {
    private List<Tarea> tareas;
    private int id;

    public ManejoDeTareas(){
        tareas = new ArrayList<>();
        id = 1;
    }

    public void addTarea(String name, String description){
        Tarea nuevaTarea = new Tarea (id++,name,description);
        tareas.add(nuevaTarea);
    }

    public void editTarea(int id,String name, String description){
        Tarea tarea = findTareaPorId(id);
        if (tarea != null){
            tarea.setName(name);
            tarea.setDescription(description);
        }
    }

    public void deleteTarea(int id){
        Tarea tarea = findTareaPorId(id);
        if (tarea != null){
            tareas.remove(tarea);
        }
    }

    public void completeTarea(int id){
        Tarea tarea = findTareaPorId(id);
        if (tarea != null){
            tarea.setCompleted(true);
        }
    }

    public List<Tarea> getTodasLasTareas() {
        return new ArrayList<>(tareas);
    }

    private Tarea findTareaPorId(int id) {
        for (Tarea tarea : tareas) {
            if (tarea.getId() == id) {
                return tarea;
            }
        }
        return null;
    }
}
