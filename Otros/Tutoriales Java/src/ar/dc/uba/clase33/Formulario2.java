package ar.dc.uba.clase33;

import javax.swing.*;
import java.awt.event.*;
public class Formulario2 extends JFrame implements ActionListener {
    JButton boton1,boton2,boton3;
    public Formulario2() {
        setLayout(null);
        boton1=new JButton("Finalizar1");
        boton1.addActionListener(this);
        boton1.setBounds(300,0,100,30);
        add(boton1);
        

        boton2=new JButton("Finalizar2");
        boton2.addActionListener(this);
        boton2.setBounds(300,50,100,30);
        add(boton2);
        
        
        boton3=new JButton("Finalizar3");
        boton3.addActionListener(this);
        boton3.setBounds(300,100,100,30);
        add(boton3);
        boton3.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            setTitle("Boton 1");
        }
        if (e.getSource()==boton2) {
            setTitle("Boton 2");
        }
        if (e.getSource()==boton3) {
            setTitle("Boton 3");
        }
    }
    
    public static void main(String[] ar) {
        Formulario2 formulario2=new Formulario2();
        formulario2.setBounds(0,0,450,350);
        formulario2.setVisible(true);
    }
}