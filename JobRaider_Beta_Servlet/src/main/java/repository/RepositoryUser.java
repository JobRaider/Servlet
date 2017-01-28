package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import conection.*;

public class RepositoryUser extends Close{
	
	protected static final String jdbcUrl = "jdbc:mysql://localhost:3306/jobraider";
	static ConnectionManager manager = new ConnectionMysql();
	
	public void insertNewUser(String name, String password,  String dni){
		Connection connection = manager.open(jdbcUrl);;
		PreparedStatement ps = null;
		
		try{
			ps = connection.prepareStatement("INSERT INTO user (nombre, password, dni) VALUES( ?, ?, ? )");
			ps.setString(1, name);
			ps.setString(2, password);
			ps.setString(3, dni);
			ps.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally {
			close(ps);
		}
		
		manager.close(connection);
	}

	public boolean validateUser(String name, String pass) {
		boolean status = false;
		Connection connection = manager.open(jdbcUrl);;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps = connection.prepareStatement("SELECT * FROM user WHERE nombre=? and password=?");
			ps.setString(1, name);
			ps.setString(2, pass);

			rs = ps.executeQuery();
			status = rs.next();
		}catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally {
			close(rs);
			close(ps);
		}
		
		manager.close(connection);
		return status;
	}
}
