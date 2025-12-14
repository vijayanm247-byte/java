import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        char a=s.next().charAt(0);
        a=Character.toLowerCase(a);
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='o'||a=='u')
        System.out.print("it is vowel");
        else
        System.out.print("it is consonant");
    }
}