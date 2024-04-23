package trycatch;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Example1 {
    public static void main(String args[]){
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("Started.....");
    	
        
        try{
        	System.out.println("Enter First No:");
        	int a=sc.nextInt();
        	System.out.println("Enter Second No:");
        	int b=sc.nextInt();
            int r=a/b;
            System.out.println("Result:"+r);
        }
        catch(InputMismatchException e) {
        	System.out.println("Please Enter an Integer Value");
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Terminated....");
    }
}
