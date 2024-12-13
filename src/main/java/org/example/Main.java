package org.example;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        /*ComunidadEPN miembroEPN=new ComunidadEPN();
        miembroEPN.setCedula("1751503234");
        miembroEPN.setNombre("Edwin Sarango");
        miembroEPN.setEdad(20);
        miembroEPN.setDireccion("Quito");
        miembroEPN.setTelefono("0987654523");
        miembroEPN.setCorreo("edwin.sarango@gmail.com");

        ComunidadEPN miembroEPN2=new ComunidadEPN("1751503234","Edwin Sarango",20,"Quito","098765431","edwin.sarango@gmail.com");

        miembroEPN.MostrarDatos();
        System.out.println("--------------------------");
        miembroEPN2.MostrarDatos();




        Profesor profesor = new Profesor("123456789","Juan Perez",30,"Ambato",
                "09127836776","juan.perez@gmail.com", "POO","Sistemas","Temporada");

        profesor.MostrarDatos();

        Estudiante estudiante = new Estudiante("12738918724","Ana Pasquel",20,"Quito",
                "0981723762","ana.pasquel@gmail.com",1001,"2024b","Sistemas","esfot");

        estudiante.MostrarDatos();*/


        JFrame frame = new JFrame("EPN");
        frame.setContentPane(new form1().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setPreferredSize(new Dimension(800, 600));
        frame.setBackground(Color.BLACK);
        frame.pack();
        frame.setVisible(true);


    }
}