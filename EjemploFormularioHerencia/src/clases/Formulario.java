package clases;

import java.awt.Point;

import javax.swing.JFrame;

//awt
//swing
//javafx

public class Formulario extends JFrame{
	public Formulario(){
		setTitle("Super formulario");
		setSize(500, 500);
		/*Point p = new Point(200,20);
		setLocation(p);*/
		setLocationRelativeTo(null);//Centrar el formulario

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Formulario();
	}
}