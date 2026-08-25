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



        //Example 2
        String lower = "jack parrot";
        String upper = "JACK PARROT";

        /**in this case equalsIgnoreCase() will ignore cases and print out Same output in if block
         but if we were using equals() itself it would print out code in else block*/
        if(lower.equalsIgnoreCase(upper)){
            System.out.println("Same output");
        }else {
            System.out.println("NOt matching");
        }

    }
}
