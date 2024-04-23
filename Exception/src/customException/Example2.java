package customException;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter a no:");
			int a=sc.nextInt();
			NegativeNumberException n=new NegativeNumberException(a);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
class CustomExp extends Exception{
	public CustomExp(String message) {
		super(message);
	}
}
class NegativeNumberException{
	
	public  NegativeNumberException(int n) throws CustomExp{
		try {
			if(n<0) {
				throw new CustomExp("Negative Number");
			}
			else {
				System.out.println("Value:"+n);
			}
		}
		catch(CustomExp e) {
			System.out.println(e.getMessage());
		}
	}
}
	

