public class BankAccount {
    String accountNumber;
    double balance;
    double interestRate;

    BankAccount(String accountNumber, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }
    //deposite
    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited " + amount);
            System.out.println("Your balance is now " + balance);
        }else{
            System.out.println("Invalid amount");
        }
    }
    //withdraw
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Invalid amount");
        } else if (amount <=0) {
            System.out.println("Invalid amount");
        }else{
            balance = balance - amount;
            System.out.println("withdrawn " + amount);
            System.out.println("Your balance is now " + balance);
        }
    }
    //interest
    double calculateInterest() {
        return (balance * interestRate)/100;
    }
    void showinfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate);
    }
}
//Saving account
class SavingsAccount extends  BankAccount {
    int withdrawLimit;
    SavingsAccount(String accountNumber, double balance, double interestRate , int  withdrawLimit) {
        super(accountNumber, balance, interestRate);
        this.withdrawLimit = withdrawLimit;
    }
    @Override
    double calculateInterest() {
        double interest = (balance*interestRate)/100;
        System.out.println("Savings Account with Interest Rate " + interest);
        return interest;
    }
    @Override
    void showinfo() {
        System.out.println("Savings Account: ");
                super.showinfo();
        System.out.println("Withdrawal Limit : " + withdrawLimit);
    }
}
class DpsAccount extends  BankAccount {
    double monthlyDeposit;
    DpsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance, interestRate);
        this.monthlyDeposit = monthlyDeposit;
    }
    @Override
    double calculateInterest() {
        double yearlyDeposit = monthlyDeposit*12;
        double interest = (yearlyDeposit*interestRate)/100;
        System.out.println("Dps Account Yearly Deposite: " + yearlyDeposit);
        System.out.println("Dps account Monthly Deposit: " + monthlyDeposit);
        return interest;
    }
    @Override
    void showinfo() {
        System.out.println("Dps Account: ");
        super.showinfo();
        System.out.println("Monthly Deposit: " + monthlyDeposit);
    }
}
class FixedDeposteAccount extends  BankAccount {
    int termMonth;
    FixedDeposteAccount(String accountNumber, double balance, double interestRate, int termMonth) {
        super(accountNumber, balance, interestRate);
        this.termMonth = termMonth;
    }
    @Override
    double calculateInterest() {
        double interest = balance * (interestRate/100) *(termMonth*12.0);
        System.out.println("FixedDeposte Account Term: " + termMonth + "months");
        System.out.println("FixedDeposte Account interest: " + interest);
        return interest;
    }
    @Override
    void showinfo() {
        System.out.println("FixedDeposte Account: ");
        super.showinfo();
        System.out.println("Term Month: " + termMonth);
    }
}