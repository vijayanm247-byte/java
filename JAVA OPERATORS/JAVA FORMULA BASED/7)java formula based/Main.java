import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double celsius=sc.nextDouble();
        double Faherenheit=(celsius*9/5)+32;
        System.out.print(Faherenheit);
    }
}