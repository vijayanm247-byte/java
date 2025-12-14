import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Amount:");
        int amount=s.nextInt();
        int note2000=amount/2000;
        amount=amount%2000;
        int note500=amount/500;
        amount=amount%500;
        int note100=amount/100;
        amount=amount%100;
        System.out.println("2000 Notes:"+note2000);
        System.out.println("500 Notes:"+note500);
        System.out.println("100 Notes:"+note100);
    }
}