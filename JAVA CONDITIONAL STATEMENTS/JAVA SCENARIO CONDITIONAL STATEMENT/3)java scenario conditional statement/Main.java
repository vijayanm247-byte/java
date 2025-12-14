import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter your age:");
        int age=s.nextInt();
        if(age>=60)
        System.out.print("You are eligible for senior citizenship benefits");
        else
        System.out.print("You are not eligible for senior citizenship benefits");
    }
}