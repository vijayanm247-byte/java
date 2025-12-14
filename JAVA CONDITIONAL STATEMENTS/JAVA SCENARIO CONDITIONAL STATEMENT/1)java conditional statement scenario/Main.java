import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        double billamount,discount=0,finalamount;
        System.out.print("Enter the bill amount:");
        billamount=s.nextDouble();
        if(billamount<1000){
        discount=0;
        }
        else if(billamount>=1000&&billamount<5000){
            discount=billamount*0.05;
        }
        else if(billamount>=5000&&billamount<10000){
            discount=billamount*0.10;
        }
        else{
            discount=billamount*0.15;
        }
        finalamount=billamount-discount;
        System.out.println("discount amount:"+discount);
        System.out.println("final amount:"+finalamount);
    }
}