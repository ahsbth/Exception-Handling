package trycatch;
import java.util.Scanner;
public class Example5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter a no");
			int n=sc.nextInt();
			long fact=1;
			while(n>0) {
				fact=fact*n;
				n--;
			}
			System.out.println("Factorial="+fact);
		}
		catch(Exception e) {
			System.out.println("Illigle arguments");
		}
		finally {
			sc.close();
		}

	}

}
