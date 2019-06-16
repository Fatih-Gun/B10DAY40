
public class HouseBuilder {

	public static void main(String[] args) {
		House house1 = new House();
		house1.adress="kjds";
		house1.houseType="summer";
		house1.bedrooms=2;
		house1.year=2008;
		
		House []houses=new House[2];
		houses[0]=house1;
		System.out.println(houses[0].adress);
		System.out.println(house1.adress);
		
		for(House each  :  houses) {
			if(each.year>=2006 && each.year<=2016 ) {
				System.out.println(each.year);
			}
		}
		
	}

}
