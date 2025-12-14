import java.util.Scanner;
public class Main
{
	public static void main(String[] args){
	    Scanner s=new Scanner(System.in);
		System.out.print("Enter the data %");
		int data=s.nextInt();
		if(data<50)
		System.out.print("Low Data");
		else if(data==50)
		System.out.print("Half Data Consumed");
		else if(data>=100)
		System.out.print("Data Over");
		else
		System.out.print("Data Available");
	}
}
