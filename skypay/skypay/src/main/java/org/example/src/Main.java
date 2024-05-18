package org.example.src;

public class Main {
    public static void main(String[] args) {

        Account account1 = new Account();
        account1.deposit(200);
        account1.withdraw(30);
        account1.deposit(600);
        account1.withdraw(400);

        account1.printStatement();


    }


}