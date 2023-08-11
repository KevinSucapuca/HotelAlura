package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modelo.Huesped;

public class HuespedDAO {
	
	private Connection con;

	public HuespedDAO(Connection con) {
		super();
		this.con = con;
	}
	
	public void guardar (Huesped huesped) {
		
		try {
			String sql = "INSERT INTO huesped (nombre, apellido, fecha_naciemiento, nacionalidad"
					+ ", telefono, id_reserva) values(?,?,?,?,?,?)";
			
			try (PreparedStatement pstm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS )){
				pstm.setString(1,huesped.getNombre());
				pstm.setString(2,huesped.getApellido());
				pstm.setObject(3,huesped.getFechaNacimiento());
				pstm.setString(4,huesped.getNacionalidad());
				pstm.setString(5,huesped.getTelefono());
				pstm.setInt(6,huesped.getIdReserva());
				
				pstm.execute();
				
				try(ResultSet rst = pstm.getGeneratedKeys()){
					while (rst.next()) {
						huesped.setId(rst.getInt(1));
					}
				}
				
			}
			
			
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}