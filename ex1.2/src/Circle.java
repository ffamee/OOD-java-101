public class Circle {

	private double radius;
	
	public Circle() {
		this.radius = 1.0;
	}
	
	public Circle(double r) {
		this.radius = r;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double r) {
		this.radius = r;
	}
	
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
	
	public double getCircumference() {
		return 2 * Math.PI * this.radius;
	}
	
	public String toString() {
		return "Circle[radius=" + radius + "]";
	}
}
