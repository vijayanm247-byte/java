import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
        if(a==b&&a==c&&b==c)
        System.out.print("equilateral");
        else if(a==b||a==c||b==c)
        System.out.print("isosceles");
        else
        System.out.print("scalene");
    }
}