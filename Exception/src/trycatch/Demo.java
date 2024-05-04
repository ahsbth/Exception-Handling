package trycatch;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter First No");
		int a=sc.nextInt();
		System.out.println("Enter the Second No");
		int b=sc.nextInt();
		try{
			System.out.println("Devision="+(a/b));
			
		}
		catch(Exception e) {
			System.out.println("Can't devide by zero");
		}
		System.out.println("Addition="+(a+b));
		System.out.println("Substraction="+(a-b));
		System.out.println("Multiplication="+(a*b));

	}

}
