public class Author {

	private String name;
	private String email;
	
	public Author(String n, String e) {
		this.name = n;
		this.email = e;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String e) {
		this.email = e;
	}
	
	public String toString() {
		return "Author[name=" + this.name + ",email=" + this.email + "]"; 
	}
}
