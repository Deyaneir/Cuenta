package Cuenta;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Datos {
    private JTextField Usuario;
    private JPasswordField Password;
    private JButton logInButton;
    private JLabel Accseso;
    public JPanel secion;


    public Datos() {
        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = String.copyValueOf(Usuario.getText().toCharArray());
                String password = String.copyValueOf(Password.getPassword());

                // Comparar usando .equals() para el contenido de las cadenas
                if (!nombre.equals("APELLIDO") && !password.equals("APELLIDO123")) {
                    Accseso.setText("Accseso DENEGADO");
                } else if (!nombre.equals("APELLIDO") && password.equals("APELLIDO123")) {
                    Accseso.setText("Acseso DENEGADO");
                } else if (nombre.equals("APELLIDO") && !password.equals("APELLIDO123")) {
                    Accseso.setText("Acseso Denegado");
                } else {
                    Accseso.setText("Accseso AUTORIZADO");
                }
            }


        });
        };
    }

