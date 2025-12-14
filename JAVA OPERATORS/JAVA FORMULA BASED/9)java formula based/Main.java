import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt(),width=sc.nextInt();
        int perimeter=2*(length+width);
        System.out.print(perimeter);
    }
}