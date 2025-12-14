import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble(),h=sc.nextDouble();
        double sa=2*Math.PI*r*(r+h);
        double v=Math.PI*r*r*h;
        System.out.print(+sa+"\n"+v);
    }
}