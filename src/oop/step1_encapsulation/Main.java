package oop.step1_encapsulation;

public class Main {
    public static void main(String[] args) {
            BankAccount account = new BankAccount(1001, "Kim", 10000);
            account.deposit(5000);
            account.withdraw(3000);
            System.out.println(account.getBalance());
    }
}
