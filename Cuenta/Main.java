package Cuenta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args){
        System.out.println("Bienvenidos al sistema");
        JFrame frame=new JFrame("Ingreso de secion");
        frame.setContentPane(new Datos().secion);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1024,768);
        frame.setPreferredSize(new Dimension(1024,728));
        frame.pack();
        frame.setVisible(true);
    }
}
