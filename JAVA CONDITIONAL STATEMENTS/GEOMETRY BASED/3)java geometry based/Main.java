import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int x=s.nextInt(),y=s.nextInt();
        if(x>0&&y>0)
        System.out.print("1st quadrant");
        else if(x<0&&y>0)
        System.out.print("2nd quadrant");
        else if(x<0&&y<0)
        System.out.print("3rd quadrant");
        else 
        System.out.print("4th quadrant");
    }
}