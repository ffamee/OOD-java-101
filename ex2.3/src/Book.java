public class Book {

	private String isbn;
	private String name;
	private Author author;
	private double price;
	private int qty;
	
	public Book(String i, String n, Author a, double p) {
		this.isbn = i;
		this.name = n;
		this.author = a;
		this.price = p;
		this.qty = 0;
	}
	
	public Book(String i, String n, Author a, double p, int q) {
		this.isbn = i;
		this.name = n;
		this.author = a;
		this.price = p;
		this.qty = q;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return this.qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public String getName() {
		return this.name;
	}

	public Author getAuthor() {
		return this.author;
	}
	
	public String getAuthorName() {
		return this.author.getName();
	}
	
	public String toString() {
		return "Book[isbn=" + this.isbn + ",name=" + this.name + "," + this.author + ",price=" + this.price + ",qty=" + this.qty + "]";
	}
	
}
