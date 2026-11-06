package Adapter;

public class FastPayLegacy {
    public void executeTransaction(double dollarsAmount) {
        System.out.println("Pago via FastPay: $" + dollarsAmount);
    }
}