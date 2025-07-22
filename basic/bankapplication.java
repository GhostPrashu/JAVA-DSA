
import java.util.Scanner;

public class bankapplication {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int balance=0;
       
        while (true) { 
            System.out.println("select the required option \n 1.deposit\n2.withdrw\n3.check balance\n4.intrest");
            int choice=sc.nextInt();
            
            switch(choice){
                case 1: 
                System.out.println("Deposit amount:");
                double dep_amt=sc.nextDouble();
                balance+=dep_amt;
                break;
                case 2:
                System.out.println("Withdraw amount :");
                double withdraw_amt=sc.nextDouble();
                balance-=withdraw_amt;
                break;
                case 3:
                
                System.out.println(balance);
                break;
                case 4:
                System.out.println("Enter how many months:");
                int months=sc.nextInt();
                double interest=(balance*0.04)*months;
                System.out.println(interest);
                break;
                default:
                System.out.println("Invalid");
            }

        }
    }
}
