import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		System.out.print("Enter the speed of the vehicle:");
		int speed=s.nextInt();
		if(speed>100)
		System.out.print("Speed exceeds 100km/h");
		else
		System.out.print("Speed is less than 100km/h");
	}
}
