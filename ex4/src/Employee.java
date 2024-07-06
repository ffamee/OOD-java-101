public class Employee {

	private int id;
	private String firstname;
	private String lastname;
	private int salary;
	
	public Employee(int i, String f, String l, int s) {
		this.id = i;
		this.firstname = f;
		this.lastname = l;
		this.salary = s;
	}
	
	public int getId() {
		return this.id;
	}
	
	 public String getFirstName() {
		 return this.firstname;
	 }
	 
	 public String getLastName() {
		 return this.lastname;
	 }
	 
	 public String getName() {
		 return this.firstname + " " + this.lastname;
	 }
	 
	 public int getSalary() {
		 return this.salary;
	 }
	 
	 public void setSalary(int s) {
		 this.salary = s;
	 }
	 
	 public int getAnnualSalary() {
		 return this.salary * 12;
	 }
	 
	 public int raiseSalary(int r) {
		 return this.salary * (100 + r) / 100;
	 }
	 
	 public String toString() {
		 return "Employee[id=" + this.id + ",name=" + getName() + ",salary=" + this.salary + "]";
	 }
	 

}
	