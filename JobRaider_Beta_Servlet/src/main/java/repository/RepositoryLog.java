package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conection.*;
import model.Log;

public class RepositoryLog  extends Close{
	
	protected static final String jdbcUrl = "jdbc:mysql://localhost:3306/jobraider";
	static ConnectionManager manager = new ConnectionMysql();
	
	public void insertNewLog(String name, String state){
		Connection connection = manager.open(jdbcUrl);;
		PreparedStatement ps = null;
		
		try{
			ps = connection.prepareStatement("INSERT INTO log (nombre, fecha, hora, estado) VALUES( ?,  NOW() ,CURTIME()  , ?)");
			ps.setString(1, name);
			ps.setString(2, state);
			ps.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally {
			close(ps);
		}
		
		manager.close(connection);
	}
	
	public List<Log> listAllLogs(){
		Connection connection =  manager.open(jdbcUrl);;
		List<Log> listLog= new ArrayList<Log>();
		ResultSet resultSet = null;
		PreparedStatement prepareStatement = null;
		
		try {
			prepareStatement = connection.prepareStatement("SELECT * FROM log ");
			resultSet = prepareStatement.executeQuery();
			while(resultSet.next()){
				Log userInDatabase = new Log();
				
				userInDatabase.setName(resultSet.getString(1));
				userInDatabase.setHour(resultSet.getDate(2));
				userInDatabase.setDate(resultSet.getDate(3));
				userInDatabase.setState(resultSet.getString(4));
				
				listLog.add(userInDatabase);
			}	
		} catch (SQLException se) {
	        se.printStackTrace();
		} finally {
			close(resultSet);
			close(prepareStatement); 
		} 
		
		manager.close(connection);
	    return listLog;
	}
}
