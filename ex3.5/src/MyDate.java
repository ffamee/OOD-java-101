
public class MyDate {

	private int year;
	private int month;
	private int day;
	
	public 	String[] MONTHS = {
			"Jan", "Feb", "Mar", "Apr", "May", "Jun",
			"Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
	};
	public String[] DAYS = {
			"Sunday", "Monday", "Tuesday", "Wednesday",
			"Thursday", "Friday", "Saturday"
	};
	public int[] DAYSINMONTHS = {
			31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
	};
	
	public boolean isLeapYear(int y) {
		return (y % 400 == 0) ? true : (y % 100 == 0) ? false : (y % 4 == 0) ? true : false;
	}
	
	public boolean isValidDate(int y, int m, int d) {
		if(isLeapYear(y)) {
			if(d == 2) {
				if(d > 29) return false;
				return true;}
		}
		else {
			if(d == 2) {
				if(d > 28) return false;
				return true;}
		}
		
		if(d > DAYSINMONTHS[m - 1]) return false;
		return true;
		}
	
	public int getDayOfWeek(int y, int m, int d) {
		
	}
	
	}

	
