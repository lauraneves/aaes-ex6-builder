package src;

import java.util.Date;

public class TransactionBuilder {
    String sourceAccount;
    String destinationAccount;
    double amount;
    String transactionType;
    Date timestamp;

    public TransactionBuilder(String sourceAccount, String destinationAccount, double amount) {
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.amount = amount;
        this.timestamp = new Date();
    }

    public TransactionBuilder withTransactionType(String transactionType) {
        this.transactionType = transactionType;
        return this;
    }

    public Transaction build() {
        return new Transaction(this);
    }
}