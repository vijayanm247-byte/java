import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a%3==0&&a%5==0)
        System.out.print("it is divisible by both 3and5");
        else
        System.out.print("it is not divisible");
    }
    
}