package com.example;

public class StringManipulation {
    
    public static void main(String[] args){

        String name = "Harry";
        String lastName = "Potter";
        String email = "harry_potter111@user.com";

        //using concatenation with concat()
        //and lowerting with lowerCase() that lowers the first letter of the string 
        String username = name.concat(lastName).toLowerCase();


        //replacing the domain of the email using replace()
        String updatedEmail = email.replace("user.com", "gmail.com");

        //finding the index number of charatcher '@' in the updated email using indexOf()
        int indexOfAd = updatedEmail.indexOf('@');

        System.out.println("Username: " + username);
        System.out.println("Updated Email: " + updatedEmail);
        System.out.println("Index of '@': " + indexOfAd);

    }

}
