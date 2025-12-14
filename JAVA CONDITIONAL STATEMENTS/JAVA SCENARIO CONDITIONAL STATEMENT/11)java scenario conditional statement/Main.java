import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the purchase amount:");
        double amount=s.nextDouble();
        double discount=0;
        if(amount<=500){
            discount=0.5*amount;
        }else if(amount<=1000){
            discount=0.10*amount;
        }else{
            discount=0.20*amount;
        }
        double finalamount=amount-discount;
        System.out.println("amount:"+amount);
        System.out.println("discount:"+discount);
        System.out.println("finalamount"+finalamount);
    }
}