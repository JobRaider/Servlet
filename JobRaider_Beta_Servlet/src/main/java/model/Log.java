package model;

import java.sql.Date;
import java.sql.Time;

public class Log {
	private String Name;
	private Date Date;
	private Time Hour;
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
	
	public Time getHour() {
		return Hour;
	}
	
	public void setHour(Time hour) {
		Hour = hour;
	}
	
	public String getState() {
		return State;
	}
	
	public void setState(String state) {
		State = state;
	}
}
