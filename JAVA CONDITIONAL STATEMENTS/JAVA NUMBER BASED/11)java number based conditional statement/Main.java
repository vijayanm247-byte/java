import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int firstdigit=a/100;
        if((firstdigit&1)==0)
        System.out.print("even");
        else
        System.out.print("odd");
    }
    
}