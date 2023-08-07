package factory;

import java.sql.Connection;
import java.sql.SQLException;

public class testConnection {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory con = new ConnectionFactory();
		Connection conection = con.conectarBase();
		
		System.out.println("Conexión exitosa");
		conection.close();
		
		System.out.println("Conexión cerrada");
				

	}

}
