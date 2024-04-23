package customException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter a no ");
			int n = sc.nextInt();
			Custom c = new Custom(n);
		} catch (InputMismatchException e) {
			System.out.println("Illigle arguments");
		} catch (MyCustomException e) {
			System.out.println(e.getMessage());
		}
	}
}

class MyCustomException extends Exception {
	public MyCustomException(String message) {
		super(message);
	}
}

class Custom {

	public Custom(int n) throws MyCustomException {
		if (n < 0) {
			throw new MyCustomException("Illigle arguments");
		} else {
			long fact = 1; 
			while (n > 0) {
				fact = fact * n;
				n--;
			}
			System.out.println("Factorial:" + fact);
		}
	}
}