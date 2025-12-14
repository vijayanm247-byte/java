import java.util.Scanner;
public class Main
{
	public static void main(String[] args){
	    Scanner s=new Scanner(System.in);
		System.out.print("Enter the mobile number:");
		String number=s.nextLine();
		if(number.length()>=10)
		System.out.print("Valid Number");
		else
		System.out.print("Invalid Number");
	}
}
