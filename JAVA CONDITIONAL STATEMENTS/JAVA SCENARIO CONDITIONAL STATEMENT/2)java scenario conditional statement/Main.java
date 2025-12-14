import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter your age:");
        int age=s.nextInt();
        if(age>=18)
        System.out.print("you are eligible to vote");
        else
        System.out.print("you are not eligible to vote");
    }
}