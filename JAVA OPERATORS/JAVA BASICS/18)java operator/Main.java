import java.util.Scanner;
public class Main
{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        String b=(a>0)?"positive":(a<0)?"negative":"zero";
        System.out.print(b);
    }
}