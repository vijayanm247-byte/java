import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int first=a/100;
        int last=a/100;
        if(first==last)
        System.out.print("equal");
        else
        System.out.print("not equal");
    }
}