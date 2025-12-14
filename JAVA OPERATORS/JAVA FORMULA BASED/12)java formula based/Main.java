import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double s=sc.nextDouble();
        double SA=6*s*s;
        double V=s*s*s;
        double P=12*s;
        System.out.print(+SA+"\n"+V+"\n"+P);
    }
}