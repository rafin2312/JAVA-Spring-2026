public class Main{
    public static void main(String[] args){
SavingsAccount savings = new SavingsAccount( "Sev111", 10000 , 5.0 , 500);
DpsAccount dps = new DpsAccount("dps-11", 10 , 8.0);
FixedDeposteAccount fd = new FixedDeposteAccount("fd-11", 10000 , 5.0 , 24);

System.out.println("--------------------");
savings.showinfo();
    System.out.println("---------------");
    dps.showinfo();
    System.out.println("-------------");
    fd.showinfo();
    System.out.println("---------------");
    savings.deposit(5000);
    savings.withdraw(5000);
    savings.withdraw(9999);

    System.out.println("---------------");
    savings.calculateInterest();
    dps.calculateInterest();
    fd.calculateInterest();
    }
}