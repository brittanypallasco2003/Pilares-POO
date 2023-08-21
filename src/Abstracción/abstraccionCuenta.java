package Abstracción;

abstract class BankAccount {
    double balance;

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class CheckingAccount extends BankAccount {
    double overdraftLimit = 1000;

    @Override
    void deposit(double amount) {
        balance += amount;
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

class SavingsAccount extends BankAccount {
    double interestRate = 0.05;

    @Override
    void deposit(double amount) {
        balance += amount;
    }

    @Override
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

public class abstraccionCuenta {
    public static void main(String[] args) {
        BankAccount checking = new CheckingAccount();
        BankAccount savings = new SavingsAccount();

        checking.deposit(1000);
        checking.withdraw(1200);

        savings.deposit(2000);
        savings.withdraw(1500);
    }
}

