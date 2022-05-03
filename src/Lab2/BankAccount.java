package Lab2;

public class BankAccount {
    private String accontName;
    private String accountNumber;
    private double balance;

    //constructor
    public BankAccount(String accontName, String accountNumber){
        this.accontName = accontName;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }
    public void deposit(double amount){
        this.balance += amount;
        if(amount >= 0){
            System.out.println("You have deposited " + amount + ", your current balance is " + balance );
        }else{
            System.out.println("Deposit failed");
        }

    }
    public void withdraw(double amount){
        if(this.balance >= amount){
            this.balance -= amount;
            System.out.println("WITHDRAWAWAL SUCCESSFUL");
        }else{
            System.out.println("INSUFFICIENT FUNDS");
        }
    }
    public void checkBalance(){
        System.out.println("Your current balance is "+ balance);
    }
}
