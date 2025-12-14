import java.util.Scanner;
public class Main
{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        String octal=Integer.toOctalString(a);
        System.out.print(octal);
    }
}