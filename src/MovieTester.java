
public class MovieTester {

	public static void main(String[] args) {
	Movie m1=new Movie();
	System.out.println(m1.name);
	m1.buy(12);
	System.out.println(m1.length);
	m1.name="Superman";
	m1.length=120;
	m1.name="sami";
	m1.watch();
	m1.buy(159);
		
	}

}
