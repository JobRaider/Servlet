package service;

import java.util.List;

import model.*;
import repository.*;

public class Service {
	private RepositoryUser repositoryUser = new RepositoryUser();
	private RepositoryLog repositoryLog = new RepositoryLog();
	
	public Boolean validateUser(String name, String pass) {
		return repositoryUser.validateUser(name, pass);
	}
	
	public void insertNewUser(String name, String pass, String dni) {
		repositoryUser.insertNewUser(name, pass, dni);
	}
	
	public void insertNewLog(String name, String state) {
		repositoryLog.insertNewLog(name, state);
	}
	
	public List<Log> listAllLogs() {
		return repositoryLog.listAllLogs();
	}

}
