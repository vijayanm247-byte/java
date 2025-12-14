import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt(),b=s.nextInt();
        if(a%10==0&&b%10==0)
        System.out.print("same last digit");
        else
        System.out.print("not a same last digit");
    }
}