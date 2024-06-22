import GUI.WindowGUI;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        WindowGUI pantalla = new WindowGUI();
        pantalla.setVisible(true);
        pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pantalla.pack();

    }
}