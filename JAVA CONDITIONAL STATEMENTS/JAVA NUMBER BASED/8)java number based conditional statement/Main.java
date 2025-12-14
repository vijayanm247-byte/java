import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int lastdigit=a%10;
        if(lastdigit%3==0)
        System.out.print("it is divisible by 3");
        else
        System.out.print("it is not divisible by 3");
    }
    
}