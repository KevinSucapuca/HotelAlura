package factory;

import java.sql.Connection;
import java.sql.SQLException;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import javax.sql.DataSource;

public class ConnectionFactory {
	
	public DataSource dataSource;
	
	public ConnectionFactory() {
		ComboPooledDataSource combopooledDataSource = new ComboPooledDataSource();
		combopooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/hotel_alura");
		combopooledDataSource.setUser("root");
		combopooledDataSource.setPassword("admin");
		
		this.dataSource = combopooledDataSource;
	}
	
	
	public Connection conectarBase(){
		try {
			return this.dataSource.getConnection();
		} catch (SQLException e) {
			
			throw new RuntimeException(e);
		}
		
	
	}
	
}
