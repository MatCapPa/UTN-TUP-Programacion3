package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Logica.ExpressionTree;
import Logica.TreeNode;
import Logica.Verification;

public class WindowGUI extends JFrame{
    private JPanel Panel;
    private JButton buttonSumar;
    private JButton buttonNumber1;
    private JButton buttonNumber2;
    private JLabel labelCuenta;
    private JButton buttonEnter;
    private JLabel labelResultado;
    private JButton buttonNumber6;
    private JButton buttonNumber5;
    private JButton buttonNumber4;
    private JButton buttonNumber0;
    private JButton buttonNumber9;
    private JButton buttonNumber3;
    private JButton buttonMultiplicar;
    private JButton buttonRestar;
    private JButton buttonNumber7;
    private JButton buttonNumber8;
    private JButton buttonAC;
    private JButton buttonDividir;

    Verification objeto1 = new Verification();
    ExpressionTree et = new ExpressionTree();

    public WindowGUI(){
        setContentPane(this.Panel);
        setTitle("Ventana");
        setSize(500,300);
        labelCuenta.setText("");
        labelResultado.setText("");

        buttonNumber1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelCuenta.setText(labelCuenta.getText()+"1");
            }
        });

        buttonNumber2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelCuenta.setText(labelCuenta.getText()+"2");
            }
        });

        buttonNumber3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelCuenta.setText(labelCuenta.getText()+"3");
            }
        });

        buttonNumber4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelCuenta.setText(labelCuenta.getText()+"4");
            }
        });

        buttonNumber5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelCuenta.setText(labelCuenta.getText()+"5");
            }
        });

        buttonNumber6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelCuenta.setText(labelCuenta.getText()+"6");
            }
        });

        buttonNumber7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelCuenta.setText(labelCuenta.getText()+"7");
            }
        });

        buttonNumber8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelCuenta.setText(labelCuenta.getText()+"8");
            }
        });

        buttonNumber9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelCuenta.setText(labelCuenta.getText()+"9");
            }
        });

        buttonNumber0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelCuenta.setText(labelCuenta.getText()+"0");
            }
        });

        buttonSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelCuenta.setText(labelCuenta.getText()+"+");
            }
        });

        buttonRestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelCuenta.setText(labelCuenta.getText()+"-");
            }
        });

        buttonMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelCuenta.setText(labelCuenta.getText()+"*");
            }
        });

        buttonDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelCuenta.setText(labelCuenta.getText()+"/");
            }
        });

        buttonAC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelCuenta.setText("");
                labelResultado.setText("");
            }
        });

        buttonEnter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cuenta = objeto1.verificarCuentaBienEscrita(labelCuenta.getText());
                if (cuenta != null){
                    TreeNode root = et.constructTree(cuenta);
                    int resultado = et.evaluate(root);
                    labelResultado.setText(" = "+ resultado);
                }else {
                    JOptionPane.showMessageDialog(Panel, "Ocurrio un error.");
                }
            }
        });

    }

}
