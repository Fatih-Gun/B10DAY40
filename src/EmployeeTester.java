
public class EmployeeTester {

	public static void main(String[] args) {
	Employee e1=new Employee();
	e1.email="fagun@gmail.com";
	e1.firstName="Fatih";
	e1.lastName="GUN";
	
	System.out.println(e1.email);
	System.out.println(e1.firstName);
	e1.work(12);
	}

}
