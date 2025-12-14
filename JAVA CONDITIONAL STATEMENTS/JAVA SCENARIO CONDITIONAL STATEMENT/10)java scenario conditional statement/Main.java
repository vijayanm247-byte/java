import java.util.Scanner;
public class Main
{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the traffic light color:");
		String color=s.next();
		if(color.equalsIgnoreCase("RED"))
		System.out.print("STOP");
		else if(color.equalsIgnoreCase("YELLOW"))
		System.out.print("GET READY");
		else if(color.equalsIgnoreCase("GREEN"))
		System.out.print("GO!!!");
		else
		System.out.print("Invalid traffic light color choose the correct ones(RED/YELLOW/GREEN)");
	}
}
