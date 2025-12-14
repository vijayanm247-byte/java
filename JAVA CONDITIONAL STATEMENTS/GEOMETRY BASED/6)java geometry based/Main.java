import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt(),b=s.nextInt(),c=s.nextInt(),d=s.nextInt();
        if(a==b&&b==c&&c==d)
        System.out.print("square");
        else if(a==c&&b==d)
        System.out.print("rectangle");
        else
        System.out.print("neither square or rectangle");
    }
}