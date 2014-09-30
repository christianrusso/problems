package ar.dc.uba.clase32;

import java.awt.Color;

import javax.swing.*;
public class Ejercicio extends JFrame {
    private JLabel label1,label2;
    public Ejercicio() {
        setLayout(null);
        label1=new JLabel("Label1");
        label1.setBounds(10,0,300,30);
        add(label1);
        label2=new JLabel("Label2");
        label2.setForeground(Color.RED);
        label2.setBounds(10,20,200,30);
        
        
        add(label2);
        JLabel label3 = new JLabel("Label3");
        label3.setBounds(10,40,200,30);
        add(label3);
    }
    
    public static void main(String[] ar) {
        Ejercicio formulario1=new Ejercicio();
        formulario1.setBounds(0,0,300,200);
        formulario1.setResizable(false);
        formulario1.setVisible(true);
    }
}
