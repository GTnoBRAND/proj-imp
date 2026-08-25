package com.example;

public class ConditionalStatement {
    static void main() {

        int moneyLeft = 300;

        if(moneyLeft >= 300){
            System.out.println("Go to Las Vegas");
            System.out.println("Enjoy some luck games");
            System.out.println("Enjoy some concerts");
            System.out.println("Enjoy fine dining");
            System.out.println("Go on a helicopter ride");
            System.out.println("Go shop some souvenirs");
        } else if (moneyLeft >= 200) {
            System.out.println("Go to hoover Dam");
        } else if (moneyLeft >=100) {
            System.out.println("Go to area 51");
        } else if (moneyLeft >= 50) {
            System.out.println("Have an ice cream");
        } else {
            System.out.println("Think about the money spent");

        }

        System.out.println("On trip to parents!");

    }
}
