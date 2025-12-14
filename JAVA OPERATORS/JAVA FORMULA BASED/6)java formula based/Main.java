import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double Fahrenheit=sc.nextDouble();
        double celsius=(Fahrenheit-32)*5/9;
        System.out.print(celsius);
    }
}
