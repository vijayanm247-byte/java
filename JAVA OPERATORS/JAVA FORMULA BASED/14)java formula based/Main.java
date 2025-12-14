import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        double sa=4*Math.PI*r*r;
        double v=(4/3)*Math.PI*r*r*r;
        System.out.print(+sa+"\n"+v);
    }
}