package com.example;

public class ManipulatingStrings {
    static void main() {


        String greeting = "Have a good day";
        String word = "good";

        //contains() returns a boolean true or false depending on the result
        if(greeting.contains(word)){
            System.out.println("You get a gift");
        }else {
            System.out.println("Next time!");
        }

    }
}
