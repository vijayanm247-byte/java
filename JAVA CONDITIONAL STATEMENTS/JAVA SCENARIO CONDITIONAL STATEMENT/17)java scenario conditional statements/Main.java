import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the day:");
        String day=s.nextLine().toLowerCase();
        int ticketprice;
        if(day.equals("Saturday")||day.equals("Sunday")){
        ticketprice=200;
        System.out.println("Weekend");
        }else{
        ticketprice=100;
        System.out.println("Weekdays");
        }
        System.out.println("Ticket price:"+ticketprice);
    }
}