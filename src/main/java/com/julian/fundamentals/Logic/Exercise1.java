package com.julian.fundamentals.Logic;
import java.util.List;

public class Exercise1 {


        public double calculateFinalPrice(double basePrice) {

            if (basePrice <= 0) {
                throw new IllegalArgumentException("The base price cannot be negative");
            }

            double currentPrice = basePrice;

            if (basePrice > 500) {
                currentPrice = basePrice * 0.90;
            }

            double finalPrice = currentPrice * 1.19;
            return finalPrice;
        }

        public double calculateCartTotal(List<Double> productPrices) {

            double total = 0;
            for (double price : productPrices) {
                if (price > 0) {
                    total += price;
                }
            }

            if (total > 0 && total < 1000) {
                total += 50;
            } else if (total >= 1000) {
                System.out.println("Free shipping applied");
            }

            return total;

        }

}


