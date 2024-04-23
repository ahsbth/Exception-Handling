package finallyblock;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Example1 {

	public static void main(String[] args) {
		
		System.out.println("Program Started.......");
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter a no:");
			int a=sc.nextInt();
			if(a%2==0) {
				System.out.println("Even");
			}
			else {
				System.out.println("odd");
			}
		}
		catch(InputMismatchException e) {
			System.out.println("Please Enter an Integer Value");
		}
		finally{
			System.out.println("allways excuted");
		}
		System.out.println("Program terminated");
	}

}
