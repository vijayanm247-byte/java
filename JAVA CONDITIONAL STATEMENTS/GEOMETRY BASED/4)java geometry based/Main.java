import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
        if(a>0&&b>0&&c>0&&a+b+c==180)
        System.out.print("valid triangle");
        else
        System.out.print("not a valid triangle");
    }
}