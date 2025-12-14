import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        char a=s.next().charAt(0),b=s.next().charAt(0);
        if(a==b)
        System.out.print("equal");
        else
        System.out.print("not equal");
    }
}