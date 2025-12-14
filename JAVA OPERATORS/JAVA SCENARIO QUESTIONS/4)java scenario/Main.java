import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the speed:");
        int speed=s.nextInt();
        System.out.print("enter the time:");
        int time=s.nextInt();
        int distance=speed*time;
        System.out.print("the distance covered:"+distance);
    }
}