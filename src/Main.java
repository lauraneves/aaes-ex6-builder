package src;

public class Main {
    public static void main(String[] args) {
        Transaction transaction = new TransactionBuilder("AccountA", "AccountB", 100.0)
                .withTransactionType("Transferência")
                .build();

        System.out.println("Transação: " + transaction.getTransactionType());
        System.out.println("De: " + transaction.getSourceAccount());
        System.out.println("Para: " + transaction.getDestinationAccount());
        System.out.println("Valor: " + transaction.getAmount());
        System.out.println("Data e Hora: " + transaction.getTimestamp());
    }
}
