import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int product=a*b;
        if(product>=0)
        System.out.print("it is positive");
        else
        System.out.print("is is negative");
    }
}