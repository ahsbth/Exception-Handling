package customException;

public class Example1 {

	public static void main(String[] args){
	    int age=17;
		try {
			if(age<18) {
				throw new UnderAge("you are not eligble for vote");
			}
			else {
				System.out.println("You are eligible");
			}
		}
		catch(UnderAge e) {
			System.out.println(e.getMessage());
		}
   
	}

}
class UnderAge extends Exception{
	
	public UnderAge() {
		super("Your are under age");
	}
	public UnderAge(String message) {
		super(message);
	}
}