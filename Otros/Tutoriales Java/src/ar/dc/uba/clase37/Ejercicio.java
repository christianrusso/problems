package ar.dc.uba.clase37;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class Ejercicio extends JFrame implements ActionListener{
    private JMenuBar mb;
    private JMenu menu1;
    private JTextField t1;
    private JTextField t2;
    private JMenuItem mi1,mi2;
    public Ejercicio() {
        setLayout(null);
        mb=new JMenuBar();
        setJMenuBar(mb);
        menu1=new JMenu("Menu");
        mb.add(menu1);
        mi1=new JMenuItem("Redimencionar");
        mi1.addActionListener(this);
        menu1.add(mi1);
        mi2=new JMenuItem("Salir");
        mi2.addActionListener(this);
        menu1.add(mi2);
        t1 = new JTextField();
        t2 = new JTextField();
        t1.setBounds(0, 0, 100, 30);
        t2.setBounds(0, 30, 100, 30);
        add(t1);
        add(t2);
                     
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==mi2) {
            System.exit(0);
        }
        if (e.getSource()==mi1) {
			int ancho=Integer.parseInt(t1.getText());
            int alto=Integer.parseInt(t2.getText());
            setSize(ancho, alto);
        }
        
    }
    
    public static void main(String[] ar) {
        Ejercicio formulario1=new Ejercicio();
        formulario1.setBounds(10,20,300,200);
        formulario1.setVisible(true);
    }    
}