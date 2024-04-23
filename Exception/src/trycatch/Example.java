package trycatch;

public class Example {

	public static void main(String[] args) {
		
		div(12,4);

	}
  public static void div(int a,int b) {
	  
	  try {
		  int r=a/b;
		  System.out.println("Result is:"+r);
	  }
	  catch(ArithmeticException e) {
		  System.out.println(e.getMessage());
	  }
  }
}
