package oop.step1_encapsulation;

public class BankAccount {
    private int accountNumber;
    private String ownerName;
    private int balance;

    public BankAccount(int accountNumber, String ownerName, int balance) {
        if (balance < 0) {
            throw new IllegalArgumentException();
        }
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("유효하지 않은 금액입니다.");
        }
        balance += amount;
    }

    public void withdraw(int amount) {
        if (amount <= 0 || balance < amount) {
            throw new IllegalArgumentException("잔액이 부족합니다.");
        }
        balance -= amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }
}
