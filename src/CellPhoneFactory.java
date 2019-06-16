
public class CellPhoneFactory {
public static void main(String[] args) {
		CellPhone samsung=new CellPhone();
	samsung.brand="Samsung";
	samsung.color="Black";
	samsung.price=234.32;
	
	System.out.println(samsung.brand);
	System.out.println(samsung.color);
	System.out.println(samsung.price);
	samsung.call();
	samsung.text();
	
}
}
