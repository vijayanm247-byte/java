import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int choice;
        double balance=100000.00;
        double amount;
        do{
            System.out.println("choose the given options below");
            System.out.println("1)Check balance");
            System.out.println("2)Deposit");
            System.out.println("3)Withdraw");
            System.out.println("4)Exit");
            choice=s.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Your current balance:"+balance);
                    break;
                    case 2:
                        System.out.print("Enter the deposit amount:");
                        amount=s.nextDouble();
                        balance+=amount;
                        if(amount>0){
                        System.out.println("Your amount is deposited successfully:"+balance);
                        }else{
                            System.out.println("invalid amount or your amount is not deposited");
                        }
                        break;
                        case 3:
                            System.out.print("Enter the amount to withdraw:");
                            amount=s.nextDouble();
                            balance-=amount;
                            if(amount>0&&amount<balance){
                                System.out.println("Amount withdrawed successfully");
                            }else{
                                System.out.println("Insufficient balance");
                            }
                            break;
                            case 4:
                                System.out.println("Thanks for choosing our ATM!!!");
                                break;
                                default:
                                System.out.println("invalid choice");
            }
        }while(choice!=4);
        s.close();
    }
}