import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("the original price:");
        int originalprice=s.nextInt();
        System.out.print("the discount percentage:");
        int discountpercentage=s.nextInt();
        int discountamount=originalprice*discountpercentage/100;
        int finalprice=originalprice-discountamount;
        System.out.println("discount amount:"+discountamount);
        System.out.println("final price:"+finalprice);
    }
}