import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the battery %:");
        int batterpercent=s.nextInt();
        if(batterpercent<=20)
        System.out.print("Low Battery Charge your mobile");
        else if(batterpercent<=50)
        System.out.print("Medium level");
        else if(batterpercent==100)
        System.out.print("Fully Charged");
        else
        System.out.print("Battery status is normal");
    }
}