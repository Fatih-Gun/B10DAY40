import java.util.Arrays;

public class ArrayToStb {

	public static void main(String[] args) {
		String [] words=new String[5];
		words[0]="coffee";
		words[1]="tea1";
		words[2]="tea2";
		words[3]="tea3";
		words[4]="tea4";
		System.out.println(Arrays.toString(words));
		StringBuilder wordStb=new StringBuilder();
		wordStb.append(words[0])
				.append(words[1])
				.append(words[2])
				.append(words[3])
				.append(words[4]);
		System.out.println(wordStb);
		StringBuilder wordStb1=new StringBuilder();
		for (String drink   : words) {
			wordStb1.append(drink);
		}
		
		System.out.println(wordStb1);
	}
	
	
	
	
	

}
