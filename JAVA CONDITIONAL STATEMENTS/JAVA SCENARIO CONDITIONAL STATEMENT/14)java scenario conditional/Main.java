import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		System.out.print("Enter the age:");
		int age=s.nextInt();
		int ticketprice;
		if(age<12){
		ticketprice=50;
		System.out.println("Child");
		}else if(age<60){
		    ticketprice=100;
		    System.out.println("Adult");
		}else{
		    ticketprice=70;
		    System.out.println("Senior");
		}
		System.out.print("Ticket price:"+ticketprice);
	}
}
