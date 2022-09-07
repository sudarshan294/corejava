package oops.encapsulation;

public class Employee {
	
	protected int emailId ;//100
	protected String email ;// sudarshan29042000@gmail.com
	protected String desigration ;//B.tech
	protected double salary ;//50000
	protected String adress ;//.......
	
	protected int age;
	
	//Setters and Getters      
	public int getEmailId() {
		
		return emailId;
	}
	public void setEmailId(int emailId) {
		this.emailId = emailId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDesigration() {
		return desigration;
	}
	public void setDesigration(String desigration) {
		this.desigration = desigration;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
}
