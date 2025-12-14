import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("No.of.cakes:");
        int cakes=s.nextInt();
        System.out.print("No.of.hours:");
        int hours=s.nextInt();
        int totalcakes=cakes*hours;
        System.out.print("total cakes:"+totalcakes);
    }
}