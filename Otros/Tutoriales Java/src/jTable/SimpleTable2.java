package jTable;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
public class SimpleTable2 extends JFrame {
	 public SimpleTable2() {
	 super("Ejemplo 2");
	 //array bidimencional de objetos con los datos de la tabla
	 Object[][] data = {
	 {"Mary", "Campione",
	 "Esquiar", new Integer(5), new Boolean(false)},
	 {"Lhucas", "Huml",
	 "Patinar", new Integer(3), new Boolean(true)},
	 {"Kathya", "Walrath",
	 "Escalar", new Integer(2), new Boolean(false)},
	 {"Marcus", "Andrews",
	 "Correr", new Integer(7), new Boolean(true)},
	 {"Angela", "Lalth",
	 "Nadar", new Integer(4), new Boolean(false)}
	 };
	 //array de String's con los t’tulos de las columnas
	 String[] columnNames = {"Nombre",
	 "Apellido",
	 "Pasatiempo",
	 "A–os de Practica",
	 "Soltero(a)"};
	 //creamos el Modelo de la tabla con los datos anteriores
	 DefaultTableModel dtm= new DefaultTableModel(data, columnNames);
	 //se crea la Tabla con el modelo DefaultTableModel
	 final JTable table = new JTable(dtm);
	 // una vez creada la tabla con su modelo
	 // podemos agregar columnas
	 String[] newColumn= {"Flan",
			 			"Pastel",
			 			"Helado",
	 "Barquillo",
	 "a" };
	 dtm.addColumn("Postre",newColumn);
	 //filas
	 Object[] newRow={"Pepe", "Grillo",
	 "Tenis", new Integer(5), new Boolean(false), "Pera"};
	 dtm.addRow(newRow);
	 //o modificar una celda en especifico
	 dtm.setValueAt("Catherine", 1, 1);
	 //se define el tama–o
	 table.setPreferredScrollableViewportSize(new Dimension(500, 70));
	 //Creamos un JscrollPane y le agregamos la JTable
	 JScrollPane scrollPane = new JScrollPane(table);
	 //Agregamos el JScrollPane al contenedor
	 getContentPane().add(scrollPane, BorderLayout.CENTER);
	 //manejamos la salida
	 addWindowListener(new WindowAdapter() {
	 public void windowClosing(WindowEvent e) {
	 System.exit(0);
	 }
	 });
	 }
	 public static void main(String[] args) {
	 SimpleTable2 frame = new SimpleTable2();
	 frame.pack();
	 frame.setVisible(true);
	 }
}
