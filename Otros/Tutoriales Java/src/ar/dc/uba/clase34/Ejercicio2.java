package ar.dc.uba.clase34;

import javax.swing.*;
import java.awt.event.*;
public class Ejercicio2 extends JFrame implements ActionListener{
    private JTextField textfield1, textfield2;
    private JButton boton1;
    public Ejercicio2() {
        setLayout(null);
        textfield1=new JTextField();
        textfield1.setBounds(0,0,150,20);
        add(textfield1);
        textfield2=new JTextField();
        textfield2.setBounds(0,30,150,20);
        add(textfield2);
        boton1=new JButton("Sumar");
        boton1.setBounds(10,50,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            String cad=textfield1.getText();
            String cad2 = textfield2.getText();
            int a = Integer.parseInt(cad);
            int b = Integer.parseInt(cad2);
            String titulo = Integer.toString(a+b);
            setTitle(titulo);
        }
    }
    
    public static void main(String[] ar) {
        Ejercicio2 formulario1=new Ejercicio2();
        formulario1.setBounds(0,0,150,100);
        formulario1.setVisible(true);
    }
}