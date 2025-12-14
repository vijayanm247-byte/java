import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		System.out.print("Enter the litres of water:");
		int litres=s.nextInt();
		double bill=0;
		if(litres<=1000)
		bill=0;
		else if(litres<=3000)
		bill=(litres-1000)*5/1000;
		else
		bill=(2000*5/1000)+((litres-3000)*10/1000);
		System.out.print("Water bill amount:"+bill);
	}
}
