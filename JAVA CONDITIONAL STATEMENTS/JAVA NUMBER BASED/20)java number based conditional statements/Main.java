import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        char a=s.next().charAt(0);
        int ascii=(int)a;
        if((ascii&1)==0)
        System.out.print("ascii value is even");
        else 
        System.out.print("odd");
    }
}