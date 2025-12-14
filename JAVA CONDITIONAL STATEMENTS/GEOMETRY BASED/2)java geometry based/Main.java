import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
        if(a*a==b*b+c*c||b*b==a*a+c*c||c*c==a*a+b*b)
        System.out.print("right angled triangle");
        else
        System.out.print("not a right angled triangle");
    }
}