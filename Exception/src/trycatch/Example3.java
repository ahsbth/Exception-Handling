package trycatch;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Example3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter Your Age");
			int age=sc.nextInt();
			System.out.println("Enter Your name:");
			
			String name=sc.nextLine();
			System.out.println("Your age is:"+age);
			System.out.println("Your Name is:"+name);
		}
		catch(InputMismatchException e) {
			System.out.println("please enter age as integer");
		}
		catch(Exception e) {
			System.out.println("please enter name in charecter formate");
		}
		finally {
			sc.close();
		}
   
	}

}
