import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int choice;
        double balance=100000.00;
        double amount;
            System.out.println("Choose the option given below");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            choice=s.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Your Balance:"+balance);
                    break;
                    case 2:
                        System.out.print("Enter the amount to be  deposited:");
                        amount=s.nextDouble();
                        balance+=amount;
                        if(amount>0){
                            System.out.println("The amount deposited to your account successfully:"+balance);
                        }else{
                            System.out.println("The amount is not deposited");
                        }
                        break;
                        case 3:
                            System.out.print("Enter the amount to be Withdraw:");
                            amount=s.nextDouble();
                            balance-=amount;
                            if(amount>0&&amount<balance){
                                System.out.println("Collect the Cash");
                            }else{
                                System.out.println("insufficient balance");
                            }
                            break;
                            case 4:
                                System.out.print("Thanks for visiting out ATM!!!");
                                break;
                                default:
                                System.out.println("Invalid choice");
            }
    }
}