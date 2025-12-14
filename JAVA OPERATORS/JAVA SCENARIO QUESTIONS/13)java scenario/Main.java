import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("mango price:");
        int price=s.nextInt();
        System.out.print("buy:");
        int buy=s.nextInt();
        int free=buy/3;
        int totalmangoes=buy+free;
        int amount=price*buy;
        System.out.println("total mangoes:"+totalmangoes);
        System.out.print("Amount:"+amount);
    }
}