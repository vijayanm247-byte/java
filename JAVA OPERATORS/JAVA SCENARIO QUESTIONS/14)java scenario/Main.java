import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("price:");
        int price=s.nextInt();
        System.out.print("no.of.pens bought:");
        int bought=s.nextInt();
        int group=bought/5;//12/5=2
        int remaining=bought%5;//12%5=2 
        int payfor=(group*3)+remaining;//2*3=6+2=8
        int amount=(price*payfor);//10*8=80
        System.out.println("pay for:"+payfor);
        System.out.print("amount:"+amount);
    }
    
}