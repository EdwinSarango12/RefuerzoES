package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    public JPanel mainPanel;
    private JTextField cedulatxt;
    private JTextField nombretxt;
    private JTextField edadtxt;
    private JTextField direcciontxt;
    private JTextField telefonotxt;
    private JTextField correotxt;
    private JButton crearbtn;
    private JLabel resultado;

    public form1() {
        crearbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ComunidadEPN miembroEPN=new ComunidadEPN();
                miembroEPN.setCedula(cedulatxt.getText());
                miembroEPN.setNombre(nombretxt.getText());
                miembroEPN.setEdad(Integer.parseInt(edadtxt.getText()));
                miembroEPN.setDireccion(direcciontxt.getText());
                miembroEPN.setTelefono(telefonotxt.getText());
                miembroEPN.setCorreo(correotxt.getText());
                resultado.setText(miembroEPN.MostrarDatos2());
            }
        });

    }
}
