package oops;
class BankAccount{
    int accountNumber;
    double balance;
    BankAccount(int accountNumber,double balance){
        this.balance=balance;
        this.accountNumber=accountNumber;
    }
    void deposit(double amount){
        balance+=amount;
        System.out.println(amount+" has been deposited into your account");
    }
    void withdraw(double amount){
        if(this.balance>amount){
            balance-=amount;
            System.out.println(amount+" has been withdrawn from your account");
        }
        else{
            System.out.println(" Your account balance is not sufficient");
        }
    }
    void displaybalance(){
        System.out.println("Your account balance is "+balance);
    }
}
class savingsAccount extends BankAccount{
    double InterestRate;
    savingsAccount(int accountNumber,double balance,double Interest){
        super(accountNumber, balance);
        this.InterestRate=InterestRate;
    }
    void addInterest(double InterestRate){
        double Interest = balance * InterestRate / 100;
        super.deposit(Interest);
    }
}
class checkingAccount extends BankAccount{
    double overdraftlimit;
    checkingAccount(int accountNumber,double balance,double overdraftlimit){
        super(accountNumber, balance);
        this.overdraftlimit=overdraftlimit;
    }
    void withdraw(double amount){
        if((this.balance+this.overdraftlimit)>amount){
            balance-=amount;
            System.out.println(amount+" has been withdrawn from your account");
        }
        else{
            System.out.println("Your overdraft limit is not sufficient");
        }
    }
}
class FdAccount extends BankAccount{
    int termInYears;
    double fdInterestRate;
    FdAccount(int accountNumber,double balance,double fdInterestRate,int termInYears){
        super(accountNumber,balance);
        this.fdInterestRate=fdInterestRate;
        this.termInYears=termInYears;
    }
    double calculateMaturityAmount(){
        double Maturity=balance+(balance*fdInterestRate*termInYears/100);
        return Maturity;
    }
}
public class banking{
    public static void main(String[] args) {
        savingsAccount sav=new savingsAccount(1234456667, 5000, 2);
        checkingAccount check=new checkingAccount(1223324245, 5000, 5000);
        FdAccount fd=new FdAccount(12321341, 5000, 3, 2);
        sav.deposit(500);
        sav.withdraw(2500);
        sav.displaybalance();

        check.deposit(1000);
        check.withdraw(3000);
        check.displaybalance();

        fd.deposit(500);
        fd.withdraw(5000);
        fd.displaybalance();
    }
}