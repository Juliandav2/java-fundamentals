package com.julian.fundamentals.Exceptions;

public class InsufficientStockException extends RuntimeException {
    private int availableStock;
    private int solicitedStock;

    public InsufficientStockException (int available, int solicited) {
        super("Insufficient Stock: " + available + ", Solicited: " + solicited);
        this.availableStock = available;
        this.solicitedStock = solicited;
    }

    public InsufficientStockException(String s) {
    }

    public int getAvailableStock() {
        return availableStock;
    }

    public int getSolicitedStock() {
        return solicitedStock;
    }
}
