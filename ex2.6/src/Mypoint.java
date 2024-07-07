public class Mypoint {

	private int x;
	private int y;
	
	public Mypoint() {
		x = 0;
		y = 0;
	}
	
	public Mypoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int[] getXY() {
		int[] test = {this.x, this.y};
		return test;
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}
	
	public double distance(int x, int y) {
		return Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
	}
	
	public double distance(Mypoint i) {
		return Math.sqrt(Math.pow((this.x - i.x), 2) + Math.pow((this.y - i.y), 2));
	}
	
	public double distance() {
		return Math.sqrt(this.y*this.y + this.x*this.x);
	}
	
	
}
