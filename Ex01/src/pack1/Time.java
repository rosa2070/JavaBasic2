package pack1;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	// 생성자
	public Time() {
		// TODO Auto-generated constructor stub
	}
	
	// 
	
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	
	public Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}

	// setter / getter
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	

	
	


}
