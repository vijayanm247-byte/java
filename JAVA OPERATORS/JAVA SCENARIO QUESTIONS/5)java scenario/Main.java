import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("running KM:");
        int KM=s.nextInt();
        int meters=(KM*1000);
        System.out.print("converted meters:"+meters);
    }
}