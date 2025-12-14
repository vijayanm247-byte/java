import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("enter the mark:");
        int marks=s.nextInt();
        if(marks<0||marks>100){
        System.out.print("invalid mark");
       } else{
           switch(marks/10){
               case 10:
                case 9:
                    System.out.print("grade a");
                    break;
                    case 8:
                        System.out.print("grade b");
                        break;
                        case 7:
                            System.out.print("grade c");
                            break;
                            default:
                            System.out.print("fail");
                   
           }
       }
    }
}