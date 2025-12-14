import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
            int l=sc.nextInt(),w=sc.nextInt(),h=sc.nextInt();
            int SA=2*(l*w+l*h+w*h);
            int V=l*w*h;
            System.out.print(+SA+"\n"+V);
    }
}