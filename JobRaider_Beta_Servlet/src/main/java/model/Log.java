package model;

import java.sql.Date;

public class Log {
	private String Name;
	private Date Date;
	private Date Hour;
	private String State;
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public Date getDate() {
		return Date;
	}
	
	public void setDate(Date date) {
		Date = date;
	}
	
	public Date getHour() {
		return Hour;
	}
	
	public void setHour(Date hour) {
		Hour = hour;
	}
	
	public String getState() {
		return State;
	}
	
	public void setState(String state) {
		State = state;
	}
}
