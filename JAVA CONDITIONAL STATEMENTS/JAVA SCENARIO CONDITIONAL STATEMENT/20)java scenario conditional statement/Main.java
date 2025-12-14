import java.util.Scanner;
public class Main
{
	public static void main(String[] args){
	    Scanner s=new Scanner(System.in);
		System.out.print("Enter the speed:");
		int speed=s.nextInt();
		if(speed>=100)
		System.out.print("Over-speeding! Fine imposed");
		else
		System.out.print("Speed is within limit");
	}
}
