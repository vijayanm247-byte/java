import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the mark:");
        int mark=s.nextInt();
        if(mark>=35)
        System.out.print("pass");
        else
        System.out.print("fail");
    }
}