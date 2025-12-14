import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("enter the day number (enter 1-7):");
        int days=s.nextInt();
        switch(days){
            case 1:
                case 2:
                    case 3:
                        case 4:
                            case 5:
                                System.out.print("weekdays");
                                break;
                                case 6:
                                    case 7:
                                        System.out.print("weekend");
                                        break;
                                        default:
                                        System.out.print("invalid day number(enter 1-7)");
                                
                
        }
        
    }
}