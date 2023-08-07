package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import factory.ConnectionFactory;

public class Usuarios {
	private String nombre;
	private String pass;
	
	public Usuarios(String nombre, String pass) {
		this.nombre = nombre;
		this.pass = pass;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public static boolean validarUsuario(String nombre, String pass) {
		ConnectionFactory con = new ConnectionFactory();
		Connection conexion = null;
		PreparedStatement statement = null;
		ResultSet resultset = null;
		try {
			conexion = con.conectarBase();
			statement = conexion.prepareStatement("SELECT * FROM USUARIO WHERE NOMBRE=? AND PASS=?");
			statement.setString(1, nombre);
			statement.setString(2, pass);
			
			resultset = statement.executeQuery();
			return resultset.next();
		} catch (SQLException e){
			e.printStackTrace();
			return false;
			
		}finally {
			try {
				if(resultset != null)
					resultset.close();
				if(statement != null)
					statement.close();
				if(conexion != null)
					conexion.close();
				
			}catch(SQLException e2) {
				e2.printStackTrace();
			}
		}
	}
	
	
}
