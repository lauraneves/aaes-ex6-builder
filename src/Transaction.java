package src;

import java.util.Date;

public class Transaction {
    private String sourceAccount;
    private String destinationAccount;
    private double amount;
    private String transactionType;
    private Date timestamp;

    Transaction(TransactionBuilder builder) {
        this.sourceAccount = builder.sourceAccount;
        this.destinationAccount = builder.destinationAccount;
        this.amount = builder.amount;
        this.transactionType = builder.transactionType;
        this.timestamp = builder.timestamp;
    }

    public String getSourceAccount() {
        return sourceAccount;
    }

    public String getDestinationAccount() {
        return destinationAccount;
    }

    public double getAmount() {
        return amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public Date getTimestamp() {
        return timestamp;
    }
}