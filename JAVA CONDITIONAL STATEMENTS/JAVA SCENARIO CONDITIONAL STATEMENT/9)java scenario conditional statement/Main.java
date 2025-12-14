import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int balance=100000;
        System.out.print("Enter the amount to be withdrawal:");
        int amount=s.nextInt();
        if(amount<=balance&&amount%100==0)
        System.out.print("withdrawal Succesfully");
        else
        System.out.print("Invalid request");
    }
}