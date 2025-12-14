import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        if(a<b)
        System.out.print("a is smallest");
        else
        System.out.print("b is smallest");
    }
    
}