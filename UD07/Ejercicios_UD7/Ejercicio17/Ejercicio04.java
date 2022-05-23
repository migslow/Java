package Ejercicio17;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ejercicio04 extends JFrame {
	Container panel;
	public JButton botonValidar;

	public JTextField Usuario, Contrase�a;
	JLabel etiqueta1, etiqueta2;

	public Ejercicio04() {
		setTitle("Iniciar Sesi�n");
		panel = getContentPane();
		panel.setLayout((null));
		etiqueta1 = new JLabel("Usuario:");
		etiqueta2 = new JLabel("Contrase�a:");

		etiqueta1.setBounds(10, 20, 60, 20);
		panel.add(etiqueta1);
		etiqueta2.setBounds(10, 50, 80, 20);
		panel.add(etiqueta2);

		Usuario = new JTextField(5);
		Usuario.setBounds(100, 20, 80, 20);
		panel.add(Usuario);
		Contrase�a = new JPasswordField(6);
		Contrase�a.setBounds(100, 50, 80, 20);
		panel.add(Contrase�a);

		botonValidar = new JButton("Validar");
		botonValidar.setBounds(100, 90, 80, 20);
		panel.add(botonValidar);

		botonValidar.addActionListener(new OyenteBoton());

		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	class OyenteBoton implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String usuario="carlos";
			String contrase�a="1234";
			
			if((Usuario.getText().equalsIgnoreCase(usuario))&& (Contrase�a.getText().equalsIgnoreCase(contrase�a))){
				setTitle("Validacion correcta");
				
			}
			else {
				setTitle("Validacion incorrecta");
				JOptionPane.showMessageDialog(null, "Validacion incorrecta, vuelva a intentarlo", "ERROR", JOptionPane.ERROR_MESSAGE);}
		}
	}

	public static void main(String args[]) {
		Ejercicio04 ventana = new Ejercicio04();

	}
}
