package com.julian.fundamentals.Abstraction;

public class Bill extends Document implements Payable {

    private double subtotal;
    private double tax;

    public Bill (String number, double subtotal) {
        super(number);
        this.subtotal = subtotal;
        this.tax = 0.19;
    }

    @Override
    public double calculateTotal () {
        return subtotal * (1 + tax);
    }

    @Override
    public void processPayment (double mount) {
        System.out.println("Process payment with $:" + mount + "for bill " + number);
    }

    @Override
    public String generateResume () {
        return "Bill #" + number + " Total: $" + calculateTotal();
    }
}
