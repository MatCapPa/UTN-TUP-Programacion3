public class Tarea {
    private int id;
    private String name;
    private String description;
    private boolean completed;

    public Tarea(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.completed = false;
    }
    public int getId(){
        return  id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return id + ": " + name + " - " + description + (completed ? " [Completed]" : "");
    }
}
