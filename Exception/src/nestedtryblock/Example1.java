package nestedtryblock;

public class Example1 {

	public static void main(String[] args) {
	
   int a[]={12,3,54,641,4};
   System.out.println("Program start");
  try {
//	  outer try block start
	  int res=a[0]/0;
	  
	  try {
//		  inner try block start
		  int r=a[9];
	  }
	  catch(ArrayIndexOutOfBoundsException e) {
		  System.out.println(e.getMessage());
	  }
//	  inner try block end
  }
//outer try block ends
  catch(ArithmeticException e) {
	  System.out.println(e.getMessage());
  }
  System.out.println("program terminates");
}
}
