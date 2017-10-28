import java.util.Scanner;

public class Deneme4 {

	public static void hesapla(double a, double b) { //a=5.0 b=3.0
		if (a > b)
			System.out.println(a + " sayýsý " + b + " sayýsýndan büyük.");
		else if (b > a)
			System.out.println(b + " sayýsý " + a + " sayýsýndan büyük.");
		else
			System.out.println("Ýki sayý birbirine eþit.");
	}
	
	
	public static void main(String[] args) {

		/*Scanner s = new Scanner(System.in);
		System.out.println("Birinci sayýyý girin: ");
		int a = s.nextInt();
		System.out.println("Ýkinci sayýyý girin: ");
		int b = s.nextInt();
		//hesapla(a, b);*/
		hesapla(5,3); //5.0 3.0
	}

}
