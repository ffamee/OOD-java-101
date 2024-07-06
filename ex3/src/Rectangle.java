
public class Rectangle {

	private float length;
	private float width;
	
	public Rectangle() {
		this.length = 1.0f;
		this.width = 1.0f;
	}
	
	public Rectangle(float l, float w) {
		this.length = l;
		this.width = w;
	}
	
	public float getLength() {
		return this.length;
	}
	
	public void setLength(float l) {
		this.length = l;
	}
	
	public float getWidth() {
		return this.width;
	}
	
	public void setWidth(float w) {
		this.width = w;
	}
	
	public double getArea() {
		return this.length * this.width;
	}
	
	public double getPerimeter() {
		return 2 * (this.length + this.width);
	}
	
	public String toString() {
		return "Rectangle[length=" + this.length + ",width=" + this.width + "]"; 
	}
	
}
