import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int sum=a+b;
        if((sum&1)==0)
        System.out.print("even");
        else
        System.out.print("odd");
    }
    
}