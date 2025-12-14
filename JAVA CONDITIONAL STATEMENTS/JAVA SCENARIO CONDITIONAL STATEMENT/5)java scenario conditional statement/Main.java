import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the temperature:");
        int temperature=s.nextInt();
        if(temperature>=100)
        System.out.print("fever");
        else
        System.out.print("normal");
    }
}