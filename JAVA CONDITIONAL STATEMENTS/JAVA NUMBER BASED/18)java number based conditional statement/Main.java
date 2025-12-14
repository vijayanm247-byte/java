import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a>=0&&a<=9)
        System.out.print("it is 1digit");
        else if(a>=10&&a<=99)
        System.out.print("it is 2digit");
        else if(a>=100&&a<=999)
        System.out.print("it is 3digit");
        else
        System.out.print("it is more than 3digit");
    }
}