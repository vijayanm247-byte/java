import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Total candies:");
        int candies=s.nextInt();
        System.out.print("No.of.Students:");
        int students=s.nextInt();
        int eachgets=candies/students;
        System.out.println("each gets:"+eachgets);
        int remaining=candies%students;
        System.out.print("remaining candies:"+remaining);
    }
}