
public class Date {

	private int day;
	private int month;
	private int year;

	public Date(int d, int m, int y) {
		this.day = d;
		this.month = m;
		this.year = y;
	}
	
	public int getDay() {
		return this.day;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void setDay(int d) {
		this.day = d;
	}
	
	public void setMonth(int m) {
		this.month = m;
	}
	
	public void setYear(int y) {
		this.year = y;
	}
	
	public void setDate(int d, int m, int y) {
		this.day = d;
		this.month = m;
		this.year = y;
	}
	
	private String zero(int x) {
		if(x < 10) return "0" + x;
		else return "" + x;
	}
	
	public String toString() {
		return zero(this.day) + "/" + zero(this.month) + "/" + this.year;
		
	}
}
