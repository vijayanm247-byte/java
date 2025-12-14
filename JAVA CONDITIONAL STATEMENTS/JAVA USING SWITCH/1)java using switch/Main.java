import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("enter the num1:");
        double num1=s.nextDouble();
        System.out.print("enter the num2:");
        double num2=s.nextDouble();
        System.out.print("select the operator(+,-,*,/):");
        char operator=s.next().charAt(0);
        double result;
        switch(operator){
        case'+':
            result=num1+num2;
            System.out.print("Result:"+result);
            break;
        case'-':
            result=num1-num2;
            System.out.print("Result"+result);
            break;
        case'*':
            result=num1*num2;
            System.out.print("Result"+result);
            break;
        case'/':
            if(num2!=0){
            result=num1/num2;
            System.out.print("Result"+result);
            }else{
            System.out.println("division by zero");
            }
            break;
            default:
            System.out.println("invalid operator");
            break;
        }
    }
}