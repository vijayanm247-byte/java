import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Total bill amount:");
        int totalbillamount=s.nextInt();
        int splitup=totalbillamount/3;
        System.out.print("Each friend pays:"+splitup);
    }
}