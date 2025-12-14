import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("enter the month number (1-12):");
        int month=s.nextInt();
        switch(month){
            case 1:
            case 2:
                case 12:
                    System.out.print("winter");
                    break;
                    case 3:
                        case 4:
                            case 5:
                                System.out.print("summer");
                                break;
                                case 6:
                                    case 7:
                                        case 8:
                                            System.out.print("rainy");
                                            break;
                                            case 9:
                                                case 10:
                                                    case 11:
                                                        System.out.print("autumn");
                                                        break;
                                                        default:
                                                        System.out.print("invalid month number enter(1-12)");
                    
        }
    }
}