import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio11GUI {
    private ManejoDeTareas manejoDeTareas;
    private DefaultListModel<Tarea> modeloDeListas;
    private JList<Tarea> listTareas;
    private JTextField tfName;
    private JTextField tfDescription;
    private JButton btAdd;
    private JButton btEdit;
    private JButton btDelete;
    private JButton btComplete;
    private JPanel panel1;
    //private JLabel lbName;
    //private JLabel lbDescription;


    public Ejercicio11GUI(){
        manejoDeTareas = new ManejoDeTareas();
        modeloDeListas = new DefaultListModel<>();
        listTareas.setModel(modeloDeListas);

        btAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTarea();
            }
        });

        btEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editTarea();
            }
        });

        btDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteTarea();
            }
        });

        btComplete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                completeTarea();
            }
        });

    }

    private void addTarea(){
        String name =tfName.getText();
        String description = tfDescription.getText();
        if (!name.isEmpty() && !description.isEmpty()) {
            manejoDeTareas.addTarea(name, description);
            actualizarLista();
            tfName.setText("");
            tfDescription.setText("");
        }else {
            JOptionPane.showMessageDialog(panel1, "Nombre y/o descripcion vacios.");
        }
    }

    private void editTarea(){
        Tarea tareaSeleccionada = listTareas.getSelectedValue();
        if (tareaSeleccionada != null){
            String name = tfName.getText();
            String description = tfDescription.getText();
            if (!name.isEmpty() && !description.isEmpty()) {
                manejoDeTareas.editTarea(tareaSeleccionada.getId(), name, description);
                actualizarLista();
                tfName.setText("");
                tfDescription.setText("");
            }else {
                JOptionPane.showMessageDialog(panel1, "Nombre y/o descripcion vacios.");
            }
        }else {
            JOptionPane.showMessageDialog(panel1, "Seleccione una tarea para editarla.");
        }
    }

    private void deleteTarea(){
        Tarea tareaSeleccionada = listTareas.getSelectedValue();
        if (tareaSeleccionada != null){
            manejoDeTareas.deleteTarea(tareaSeleccionada.getId());
            actualizarLista();
        }else {
            JOptionPane.showMessageDialog(panel1, "Seleccione una tarea para eliminarla.");
        }
    }

    private void completeTarea(){
        Tarea tareaSeleccionada = listTareas.getSelectedValue();
        if (tareaSeleccionada != null){
            manejoDeTareas.completeTarea(tareaSeleccionada.getId());
            actualizarLista();
        }else {
            JOptionPane.showMessageDialog(panel1, "Seleccione una tarea para completarla.");
        }
    }

    private void actualizarLista(){
        modeloDeListas.clear();
        for (Tarea i : manejoDeTareas.getTodasLasTareas()){
            modeloDeListas.addElement(i);
        }
    }
    //main
    public static void main(String[] args) {
        JFrame frame = new JFrame("Manejo de Tareas");
        frame.setContentPane(new Ejercicio11GUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
