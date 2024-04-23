package trycatch;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Example2 {
	
 public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	
	try {
		System.out.println("Enter a no:");
		int n=sc.nextInt();
		float sroot=(float)Math.sqrt(n);
		System.out.println("Square Root is:"+sroot);
	}
	catch(InputMismatchException e) {
		System.out.println("Please enter an integer no");
	}
 }
}
