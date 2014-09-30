package ar.dc.uba.clase36;

import javax.swing.*;
public class Formulario extends JFrame{
    private JTextField textfield1;
    private JScrollPane scrollpane1;
    private JTextArea textarea1;
    public Formulario() {
        setLayout(null);
        textfield1=new JTextField();
        textfield1.setBounds(10,10,200,30);
        add(textfield1);
        textarea1=new JTextArea();        
        scrollpane1=new JScrollPane(textarea1);    
        scrollpane1.setBounds(10,0,400,300);
        add(scrollpane1);
    }

    public static void main(String[] ar) {
        Formulario formulario1=new Formulario();
        formulario1.setBounds(0,0,540,400);
        formulario1.setVisible(true);
    }    
}