import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("enter the minutes:");
        int minutes=s.nextInt();
        int seconds=minutes*60;
        System.out.print("Seconds:"+seconds);
    }
}