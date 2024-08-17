package chuong2.bai8;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
    private long accoutNumber;
    private String name;
    private double balance;
    final double RATE = 0.035f;

    public Account() {
        this.accoutNumber = 999999;
        this.name = "Unknown";
        this.balance = 50000f;
    }

    public Account(long accoutNumber, String name, double balance) {
        this.accoutNumber = accoutNumber;
        this.name = name;
        this.balance = balance;
    }

    public Account (long accoutNumber, String name) {
        this.accoutNumber = accoutNumber;
        this.name = name;
        this.balance = 50000f;
    }

    public long getAccoutNumber() {
        return accoutNumber;
    }


    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if(amount < 0) {
            return false;
        }
        else
        {
            this.balance += amount;
            return true;
        }
    }

    public boolean withdraw(double amount, double fee) {
        if (amount  + fee > balance) {
            return false;
        }
        else {
            this.balance -= amount + fee;
            return true;
        }
    }

    public void addInterest() {
        this.balance += balance*RATE;
    }

    public boolean transfer(Account acc2, double amount) {
        if (amount > balance )
        {
            return false;
        }
        else {
            acc2.deposit(amount);
            balance -= amount;
            return true;
        }
    }
    public String toString()
    {
        Locale locale = new Locale("vi", "vn");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        return String.format("%-30s %15s %20s",this.name,this.accoutNumber,numberFormat.format(this.balance));
    }
}
