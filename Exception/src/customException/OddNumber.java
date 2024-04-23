package customException;
import java.util.Scanner;
public class OddNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter a no");
			int a=sc.nextInt();
			Odd o=new Odd(a);
		}
		catch(Exception e) {
			System.out.println("Please enter a Integer");
		}
		

	}

}
class CustomExp extends Exception{
	
	public CustomExp(String message) {
		super(message);
	}
}
class Odd{
	public Odd(int n) throws CustomExp{
		try {
			if(n%2!=0) {
				throw new CustomExp("Odd No Encounter");
			}
			else {
				System.out.println("No is:"+n);
				
			}
		}
		catch(CustomExp c) {
			System.out.println(c.getMessage());
		}
	}
}