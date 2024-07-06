
public class Account {

	private String id;
	private String name;
	private int balance;
	
	public Account(String i, String n) {
		this.id = i;
		this.name = n;
		this.balance = 0;
	}
	
	public Account(String i, String n, int b) {
		this.id = i;
		this.name = n;
		this.balance = b;
	}
	
	public String getID() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public int credit(int c) {
		this.balance = this.balance + c;
		return this.balance; 
	}
	
	public int debit(int d) {
		if (d > this.balance) {
			System.out.println("Amount exceeded balance");
			return this.balance;
		}
		else return this.balance = this.balance - d;
	}
	
	public int transferTo(Account x, int t) {
		if (t > this.balance) {
			System.out.println("Amount exceeded balance");
			return this.balance;
		}
		else {
			x.credit(t);
			this.balance = this.balance - t;
			return this.balance;
		}
	}
	
	public String toString() {
		return "Account[id=" + this.id + ",name=" + this.name + ",balance=" + this.balance + "]";
	}
	
}
