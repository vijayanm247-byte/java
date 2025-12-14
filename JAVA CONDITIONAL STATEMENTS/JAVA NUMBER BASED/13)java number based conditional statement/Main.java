import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a>0)
        System.out.print("positive");
        else if(a<0)
        System.out.print("negative");
        else
        System.out.print("zero");
    }
    
}