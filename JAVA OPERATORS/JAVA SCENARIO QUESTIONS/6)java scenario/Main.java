import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("enter the byte:");
        int bytes=s.nextInt();
        int bits=bytes*8;
        System.out.print("Bits:"+bits);
    }
}