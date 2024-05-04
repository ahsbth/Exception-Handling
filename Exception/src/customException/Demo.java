package customException;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		try {
			if(age<18) {
				throw new ExcptionDemo("You are not Eligble for vote");
			}
			else {
				System.out.println("Go Ahead for Vote");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
class ExcptionDemo extends Exception{
	public ExcptionDemo(String message) {
		super(message);
	}
}

