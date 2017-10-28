
public class Deneme6 {
	
	public static int x;
	public static void metod(int a){
		x=a;
	}

	public static void main(String[] args) {
		Deneme6 d6=new Deneme6();
		Deneme6 d66=new Deneme6();
		
		d6.metod(5);
		d66.metod(9);
		
		System.out.println(d6.x);
		System.out.println(d66.x);

	}

}
