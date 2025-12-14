import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("CP:");
        int CP=s.nextInt();
        System.out.print("Profit:");
        int profit=s.nextInt();
        int sellingprofit=CP+profit;
        System.out.print("Selling profit:"+sellingprofit);
    }
}