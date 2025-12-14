import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int storedpin=1005;
        System.out.print("Enter the pin:");
        int enteredpin=s.nextInt();
        if(storedpin==enteredpin)
        System.out.print("PIN verified procced for withdrawal");
        else
        System.out.print("Invalid PIN");
    }
}