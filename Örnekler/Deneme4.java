import java.util.Scanner;

public class Deneme4 {

	public static void hesapla(double a, double b) { //a=5.0 b=3.0
		if (a > b)
			System.out.println(a + " say�s� " + b + " say�s�ndan b�y�k.");
		else if (b > a)
			System.out.println(b + " say�s� " + a + " say�s�ndan b�y�k.");
		else
			System.out.println("�ki say� birbirine e�it.");
	}
	
	
	public static void main(String[] args) {

		/*Scanner s = new Scanner(System.in);
		System.out.println("Birinci say�y� girin: ");
		int a = s.nextInt();
		System.out.println("�kinci say�y� girin: ");
		int b = s.nextInt();
		//hesapla(a, b);*/
		hesapla(5,3); //5.0 3.0
	}

}
