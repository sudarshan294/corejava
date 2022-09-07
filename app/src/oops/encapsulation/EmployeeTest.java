package oops.encapsulation;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Employee et = new Employee();
	
	//	System.out.println(et.getEmailId());
		
		et.setEmailId(263929);		
		System.out.println(et.getEmailId());
		
		et.setEmail("sudarshan29042000@gmail.com");
		System.out.println(et.getEmail());
		
		et.setDesigration("B.Tech");
		System.out.println(et.getDesigration());
		
		et.setSalary(50000.00);
		System.out.println(et.getSalary());
		
		et.setAdress("......");
		System.out.println(et.getAdress());
		
	}
}
