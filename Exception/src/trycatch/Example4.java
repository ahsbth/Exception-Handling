package trycatch;
import java.util.Scanner;
public class Example4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the First String:");
			String s1=sc.nextLine();
			System.out.println("Enter the Second String:");
			String s2=sc.nextLine();
			String s3=s1+s2;
			System.out.println("New String is:"+s3);
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
			
		}

	}

}
