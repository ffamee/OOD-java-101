public class Account {

	private int id;
	private Customer customer;
	private double balance;
	
	public Account(int id, Customer customer) {
		this.balance = 0.0;
		this.id = id;
		this.customer = customer;
	}
	
	public Account(int id, Customer customer, int b) {
		this.balance = b;
		this.id = id;
		this.customer = customer;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public Customer getCustomer() {
		return customer;
	}
	
	public String toString() {
		return customer + "balance=$" + this.balance;
	}
	
	public String getCustomerName() {
		return customer.getName();
	}
	
	public Account deposit(double d) {
		this.balance += d;
		return this;
	}
	
	public Account wihtdraw(double w) {
		if(this.balance >= w) {
			this.balance -= w;
			return this;
		}
		else {
			System.out.println("amount withdrawn exceeds the current balance");
			return this;
		}
	}
	
}
