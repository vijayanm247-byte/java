import java.util.Scanner;
public class Main
{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        String result=(a>50)?"pass":"fail";
        System.out.print(result);
    }
}