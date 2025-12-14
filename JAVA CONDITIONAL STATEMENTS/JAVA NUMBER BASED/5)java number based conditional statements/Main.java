import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a>=100&&a<=999)
        System.out.print("it is a three digit number");
        else
        System.out.print("it is not a three digit number");
    }
    
}