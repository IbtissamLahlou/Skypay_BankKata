package org.example.src;

import java.util.Date;

public class Withdraw extends Operation{
    public Withdraw(int amount, Date date) {
        super(-amount, date);
    }
}
