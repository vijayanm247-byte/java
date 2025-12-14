import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the temperature:");
        int temperature=s.nextInt();
        if(temperature<=25){
            System.out.print("Cold");
        }else if(temperature<=30){
            System.out.print("Pleasant");
        }else if(temperature<=35){
            System.out.print("Hot"); 
        }else{
            System.out.print("Heatwaves");
        }
    }
}