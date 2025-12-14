import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("enter the unit consumed:");
        int unit=s.nextInt();
        double bill=0;
        if(unit<=100){
        bill=0;
        }else if(unit<=300){
        bill=(unit-100)*5;
        }else{
        bill=(200*5)+(unit-300)*10;
    }
    if(unit>500){
    bill=bill+(bill*0.10);
    }
    System.out.print("electricity bill:"+bill);
    }
}
