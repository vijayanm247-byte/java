import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("SP:");
        int SP=s.nextInt();
        System.out.print("Loss:");
        int loss=s.nextInt();
        int CP=SP+loss;
        System.out.print("Cost Price:"+CP);
    }
}