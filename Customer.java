
public class Customer {
	private String name;
	private int age;
	
	//PARAMETERIZED CONSTRUCTOR
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//COPY-CONSTRUCTOR
	public Customer(Customer c) {
		name = c.getName();
		age = c.getAge();
	}
	

	public String toString() {
		String str =  name + "\n" + age;
		return str;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
}
