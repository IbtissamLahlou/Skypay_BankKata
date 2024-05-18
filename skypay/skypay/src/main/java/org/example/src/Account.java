package org.example.src;
import java.util.*;

public class Account implements AccountService {

    private int balance;
    private LinkedHashMap<Operation, Integer> operationsList;

    public Account() {
        this.balance = 0;
        this.operationsList = new LinkedHashMap<>();
    }

    @Override
    public void deposit(int amount) {
        balance += amount;
        operationsList.put(new Deposit(amount, new Date()), getBalance());
    }

    @Override
    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            operationsList.put(new Withdraw(amount, new Date()), getBalance());
        } else {
            throw new RuntimeException("Insufficient balance");
        }
    }

    @Override
    public void printStatement() {

        List<Map.Entry<Operation, Integer>> entries = new ArrayList<>(operationsList.entrySet());
        Collections.reverse(entries);

        System.out.println("Date        || Amount      || Balance");
        for (Map.Entry<Operation, Integer> entry : entries) {
            Operation operation = entry.getKey();
            int balance = entry.getValue();
            System.out.println(operation.getFormattedDate() + "  || " + operation.getAmount() + "         || " + balance);
        }
        System.out.println("______________________");
    }

    public int getBalance() {
        return balance;
    }
}
