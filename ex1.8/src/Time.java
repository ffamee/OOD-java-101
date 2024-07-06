
public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	public Time(int h, int m, int s) {
		this.hour = h;
		this.minute = m;
		this.second = s;
	}
	
	public int getHour() {
		return this.hour;
	}
	
	public int getMinute() {
		return this.minute;
	}
	
	public int getSecond() {
		return this.second;
	}
	
	public void setHour(int h) {
		this.hour = h;
	}
	
	public void setMinute(int m) {
		this.minute = m;
	}
	
	public void setSecond(int s) {
		this.second = s;
	}
	
	public void setTime(int h, int m, int s) {
		this.hour = h;
		this.minute = m;
		this.second = s;
	}
	
	private String zero(int x) {
		if(x < 10) return "0" + x;
		else return "" + x;
	}
	
	public String toString() {
		return zero(this.hour) + ":" + zero(this.minute) + ":" + zero(this.second);
	}
	
	public Time nextSecond() {
		this.second = this.second + 1;
		if(this.second == 60) {
			this.second = 0;
			this.minute = this.minute + 1;
		}
		if(this.minute == 60) {
			this.minute = 0;
			this.hour = this.hour + 1;
		}
		if(this.hour == 24) {
			this.hour = 0;
		}
		return this;
	}
	
	public Time previousSecond() {
		this.second = this.second - 1;
		if(this.second < 0) {
			this.second = 59;
			this.minute = this.minute - 1;
		}
		if(this.minute < 0) {
			this.minute = 59;
			this.hour = this.hour - 1;
		}
		if(this.hour < 0) {
			this.hour = 23;
		}
		return this;
	}
	
}
