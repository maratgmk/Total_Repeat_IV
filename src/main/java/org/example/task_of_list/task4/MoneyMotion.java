package org.example.task_of_list.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MoneyMotion {
    private List<Transaction> transactions = new ArrayList<>();

    public MoneyMotion(List<Transaction> transactions) {
       this.transactions = transactions;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public double income() {
        double result = 0;
        for (Transaction transaction : transactions) {
            if (transaction.getAmount() > 0) {
                result = result + transaction.getAmount();
            }
        }
        return result;
    }
    public double outcome() {
        double result = 0;
        for (Transaction transaction : transactions) {
            if (transaction.getAmount() < 0) {
                result = result + transaction.getAmount();
            }
        }

        return result;
    }
    public double getBalance(){
        return income() + outcome();
    }



    @Override
    public String toString() {
        return "MoneyMotion{" +
                " income=" + income() +
                ", outcome=" + outcome() +
                ", balance=" + getBalance() +
                '}';
    }
}
