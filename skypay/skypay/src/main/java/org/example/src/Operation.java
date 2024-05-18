package org.example.src;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Operation {
    private Date date;
    private int amount;

    public Operation(int amount, Date date) {
        this.date = date;
        this.amount = amount;
    }

    public String getFormattedDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(date);
    }

    public int getAmount() {
        return amount;
    }


}
