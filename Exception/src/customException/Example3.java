package customException;
import java.util.Scanner;
public class Example3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("Enter a Charecter:");
			char ch=sc.next().charAt(0);
			if((ch>=65&&ch<=90)||(ch>=97&&ch<=122)) {
				char k=Character.toLowerCase(ch);
				Vowel v=new Vowel(k);
				
			}
			else {
				System.out.println("Pleas enter a charecter");
			}
		}
		catch(Exception e) {
			System.out.println("");
		}
		finally {
			sc.close();
		}

	}

}
class MyException extends Exception{
	public MyException(String message) {
		super(message);
	}
}
class Vowel{
	public Vowel(char c) throws MyException{
		try {
			if(c=='a'||c=='i'||c=='e'||c=='o'||c=='u') {
				System.out.println("Vowel Encounter");
			}
			else {
				throw new MyException("Consonant Encounterd");
			}
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
		}
	}
}
