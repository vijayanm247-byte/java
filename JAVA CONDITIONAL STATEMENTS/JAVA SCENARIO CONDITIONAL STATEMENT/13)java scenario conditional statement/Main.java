import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		System.out.print("Enter the battery %:");
		int percentage=s.nextInt();
		if(percentage==100)
		System.out.print("Fully Charged");
		else if(percentage>=21)
		System.out.print("Moderate");
		else if(percentage<=20)
		System.out.print("Low battery");
		else
		System.out.print("Enter the battery % betweeb(1-100)");
	}
}
