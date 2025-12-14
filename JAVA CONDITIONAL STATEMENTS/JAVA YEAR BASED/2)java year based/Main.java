import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a%100==0)
        System.out.print("it is a century year");
        else
        System.out.print("it is not a century year");
    }
}