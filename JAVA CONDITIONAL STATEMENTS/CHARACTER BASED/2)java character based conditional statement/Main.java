import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        char a=s.next().charAt(0);
        if(a>='A'&&a<='Z')
        System.out.print("it is uppercase");
        else if(a>='a'&&a<='z')
        System.out.print("it is lowercase");
        else if(a>='0'&&a<='9')
        System.out.print("it is digit");
        else
        System.out.print("it is special symbol");
    }
}