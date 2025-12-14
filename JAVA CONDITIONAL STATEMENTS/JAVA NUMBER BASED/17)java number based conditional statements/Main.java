import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt(),b=s.nextInt();
        if(a%10==b%10)
        System.out.print("it has the same last digit");
        else 
        System.out.print("it does not has the same last digit");
    }
}