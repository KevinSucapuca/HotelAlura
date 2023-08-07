package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Usuarios;
import views.Login;
import views.MenuUsuario;

public class UsuarioControlador implements ActionListener{
	
	private Login vista;
	
	public UsuarioControlador(Login vista) {
		this.vista = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String nombre = vista.getNombre();
		String pass = vista.getPass();
		
		if(Usuarios.validarUsuario(nombre, pass)) {
			MenuUsuario menu = new MenuUsuario();
			menu.setVisible(true);   
			vista.dispose();
		}else {
			JOptionPane.showMessageDialog(vista, "Usuario o contraseña no validos");
		}
	}

}
