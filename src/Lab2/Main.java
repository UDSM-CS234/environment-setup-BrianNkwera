package Lab2;

public class Main {
    public static void main(String[] args) {
        Pencil pencil = new Pencil("Yellow", 2.3, 300);
        pencil.display();

        BankAccount acc1 = new BankAccount("Brian Nkwera", "1501");
        BankAccount acc2 = new BankAccount("Simon Victor", "1204");

        acc1.deposit(12000);
        acc2.deposit(15000);

        acc1.withdraw(5000);
        acc2.withdraw(20000);

        acc1.checkBalance();
        acc2.checkBalance();
    }
}
