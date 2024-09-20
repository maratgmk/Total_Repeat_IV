package org.example.task_of_list.task4;

import java.time.LocalDate;

public class Transaction {
    private final String name;
    private final LocalDate date;
    private final double amount;

    public Transaction(String name, LocalDate date, double amount) {
        this.name = name;
        this.date = date;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", amount=" + amount +
                '}';
    }
}
