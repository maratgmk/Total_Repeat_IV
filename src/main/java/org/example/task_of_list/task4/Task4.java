package org.example.task_of_list.task4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 4 Напишите программу, которая учитывает все финансовые транзакции пользователя за месяц.
 * Пользователь вводит суммы каждой транзакции, и они добавляются в список.
 * Программа должна выводить общую сумму расходов и доходов за указанный месяц, а также баланс.
 * Суммы операций нужно хранить, используя списки List<Double> или List<BigDecimal>.
 */
public class Task4 {
    public static void main(String[] args) {
        Transaction transaction1 = new Transaction("salary", LocalDate.of(2024, 7, 1), 1000.99);
        Transaction transaction2 = new Transaction("rent", LocalDate.of(2024, 7, 2), -500);
        Transaction transaction3 = new Transaction("food", LocalDate.of(2024, 7, 3), -100);
        Transaction transaction4 = new Transaction("taxes", LocalDate.of(2024, 7, 5), -110.55);
        Transaction transaction5 = new Transaction("bonus issue", LocalDate.of(2024, 7, 10), 210.95);
        Transaction transaction6 = new Transaction("medicine", LocalDate.of(2024, 7, 15), -210.18);
        Transaction transaction7 = new Transaction("clothes", LocalDate.of(2024, 7, 17), -90.72);
        Transaction transaction8 = new Transaction("bonus of month", LocalDate.of(2024, 7, 19), 410.05);
        Transaction transaction9 = new Transaction("education", LocalDate.of(2024, 7, 21), -341.61);
        Transaction transaction10 = new Transaction("restaurant", LocalDate.of(2024, 7, 25), -91.34);
        List<Transaction> transactions = new ArrayList<>();
        Collections.addAll(transactions,transaction1,transaction2,transaction3,transaction4,transaction5,
                transaction6,transaction7,transaction8,transaction9,transaction10);
        MoneyMotion mm = new MoneyMotion(transactions);
        System.out.println(mm.income());
        System.out.println(mm.outcome());
        System.out.println(mm.getBalance());
        System.out.println(mm);


    }
}
