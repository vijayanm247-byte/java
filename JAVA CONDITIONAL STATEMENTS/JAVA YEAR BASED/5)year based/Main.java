import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("enter the year:");
        int year=s.nextInt();
        System.out.print("enter the month:");
        int month=s.nextInt();
        if(month<1||month>12||year<=0){
        System.out.print("invalid year or month");
        }
        int[]daysinmonth={31,28,31,30,31,30,31,31,30,31,30,31};
        if (month==2&&((year%4==0&&year%100!=0)||(year%400==0))){
            daysinmonth[1]=29;
        }
        System.out.println("The month " + month + " of year " + year + " has " + daysinmonth[month - 1] + " days.");
    }
}