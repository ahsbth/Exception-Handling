package nestedtryblock;

public class Example2 {

	public static void main(String[] args) {
		System.out.println("Program is Start");
		String s="null";
		int a[]= {12,2,4,53,46};
		try {
			int len=s.length();
			
			try {
				int res= a[3]/90;
				
				try {
					int r=a[8];
				}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println(e.getMessage());
				}
			}
			catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		}
		catch(NullPointerException e) {
			System.out.println("String is empty");
		}
		System.out.println("Program is terminated");

	}

}
