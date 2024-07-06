public class Customer {

	private int id;
	private String name;
	private int discount;
	
	public Customer(int i, String n, int d) {
		id = i;
		name = n;
		discount = d;
	}

	public int getDiscount() {
		return discount;
	}
	
	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		return this.name + "(" + this.id + ")(" + this.discount + "%)";
	}
	
}
