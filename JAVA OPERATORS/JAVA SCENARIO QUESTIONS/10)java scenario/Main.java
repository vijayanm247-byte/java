import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("basics:");
        int basic=s.nextInt();
        System.out.print("HRA:");
        int HRA=s.nextInt();
        System.out.print("allowance:");
        int allowance=s.nextInt();
        int totalsalery=(basic+HRA+allowance);
        System.out.print("total salery:"+totalsalery);
    }
}