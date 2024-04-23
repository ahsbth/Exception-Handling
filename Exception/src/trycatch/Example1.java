package trycatch;

public class Example1 {
    public static void main(String args[]){
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        try{
            int r=a/b;
            System.out.println("Result:"+r);
        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
