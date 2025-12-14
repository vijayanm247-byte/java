import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a>b&&a>c)
        System.out.print("a is greater");
        else if(b>c)
        System.out.print("b is greater");
        else
        System.out.print("c is greater");
    }
    
}