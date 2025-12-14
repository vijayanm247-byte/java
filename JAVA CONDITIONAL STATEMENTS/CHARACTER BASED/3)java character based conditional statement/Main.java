import java.util.Scanner;
public class Main{
    public static void main(String args[]){
       Scanner s=new Scanner(System.in);
       char a=s.next().charAt(0);
       a=Character.toLowerCase(a);
       if(a>='a'&&a<='z')
       System.out.print("alphabet");
       else
       System.out.print("not an alphabet");
    }
}