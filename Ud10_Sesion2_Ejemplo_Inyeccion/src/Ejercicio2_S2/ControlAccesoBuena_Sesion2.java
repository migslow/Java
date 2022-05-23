package Ejercicio2_S2;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ControlAccesoBuena_Sesion2 extends JFrame implements ActionListener {

	private Container panel;
	private JLabel usuario;
	private JLabel contrase�a;
	private JTextField usuarioText;
	private JPasswordField passwordText;
	private JButton aceptar;
	private JLabel Respuesta;
	private JLabel Imagen;
	static AccesoBdatosUsu_Sesion2 abd= new AccesoBdatosUsu_Sesion2();
	public ControlAccesoBuena_Sesion2() {
		super("Control de Acceso Curso 2021-2022");
		panel = getContentPane();
		panel.setLayout(null);

		usuario = new JLabel("Usuario");
		usuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		usuario.setBounds(21, 43, 101, 33);
		panel.add(usuario);

		contrase�a = new JLabel("Contrase�a");
		contrase�a.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contrase�a.setBounds(21, 87, 80, 33);
		panel.add(contrase�a);

		usuarioText = new JTextField();
		usuarioText.setFont(new Font("Tahoma", Font.PLAIN, 12));
		usuarioText.setBounds(111, 50, 111, 20);
		panel.add(usuarioText);
		usuarioText.setColumns(10);

		passwordText = new JPasswordField();
		passwordText.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passwordText.setBounds(111, 94, 111, 20);
		panel.add(passwordText);
		passwordText.setColumns(10);

		Respuesta = new JLabel("");
		Respuesta.setFont(new Font("Tahoma", Font.BOLD, 12));
		Respuesta.setBounds(21, 290, 241, 14);
		panel.add(Respuesta);

		Imagen = new JLabel("");
		Imagen.setIcon(new ImageIcon("imagenes/candado_cerrado.png"));
		Imagen.setBounds(171, 119, 111, 131);
		panel.add(Imagen);

		aceptar = new JButton("Aceptar");
		aceptar.setBounds(271, 71, 89, 23);
		panel.add(aceptar);
		aceptar.addActionListener(this);

		setSize( 450, 370);
		setVisible(true);
		setDefaultCloseOperation(0);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
		try {
			abd.desconectar();
			System.out.println("desconectado");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.exit(0);}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(usuarioText.getText().isEmpty()||passwordText.getText().isEmpty())
			JOptionPane.showMessageDialog(null, "DEBE COMPLETAR LOS DOS CAMPOS", "Mensaje", JOptionPane.ERROR_MESSAGE);
		else {
		try {
			Respuesta.setText(abd.compruebaContrase�a(usuarioText.getText(), passwordText.getText()));
		} catch (SQLException e1) {
			System.out.println("Usuario o contrase�as incorrectos");
		};
		
		try {
			if (abd.reg.getNString(3).equals(abd.compruebaContrase�a(usuarioText.getText(), passwordText.getText()))) {
				Imagen.setIcon(new ImageIcon("imagenes/candado_abierto.png"));
			}
			
		} catch (SQLException e1) {
			System.out.println("Usuario o contrase�a incorrectos");
			Imagen.setIcon(new ImageIcon("imagenes/candado_cerrado.png"));
		}}
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ControlAccesoBuena_Sesion2 ventana = new ControlAccesoBuena_Sesion2();
		abd.conectar();
	
	}

}
