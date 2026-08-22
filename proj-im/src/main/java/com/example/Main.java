package com.example;

public class Main {
    public static void main(String[] args) {
        

        //using arithmetic operations

        double amountInUSD = 200;

        double exchangeRateUSDtoEUR = 0.85;

        System.out.println("Amount in USD: " + amountInUSD);

        double amountInEUR = amountInUSD *exchangeRateUSDtoEUR;

        System.out.println("Amount in EUR: " + amountInEUR);

        int expenditureForBooksINEUR = 55;

        double remaining = amountInEUR - expenditureForBooksINEUR;

        System.out.println("Remaining amount after expenditure: " + remaining);

        double EURtoUSD = 1.18;

        double inUSD = remaining * EURtoUSD;

        System.out.println("Remaining amount in USD: " + inUSD);

    }
}