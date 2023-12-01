package com.userregistration;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------WELCOME TO THE USER REGISTRATION PORTAL------------");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first name(First letter as Capital and minimum 3 characters) :");
        String fName = sc.nextLine();

        System.out.println("Enter the last name First letter as Capital and minimum 3 characters:");
        String lName = sc.nextLine();

        System.out.println("Enter the Email-id:");
        String emailId = sc.nextLine();

        System.out.println("Enter the Phone number:");
        String phoneNo = sc.nextLine();

        System.out.println(
                "Enter the Password(Ensures it has atleast 1 capital letter, 1 numeric value, 1 special character and minimum length must be 8):");
        String password = sc.nextLine();

        if (UserRegistrationPortal.firstName(fName) && UserRegistrationPortal.lastName(lName)) {
            System.out.println("Valid first and last name!");

        } else {
            System.out.println("Invalid first name. Please enter in a valid format!!");
        }

        if (UserRegistrationPortal.EmailId(emailId)) {
            System.out.println("Valid Email-Id!");

        } else {
            System.out.println("Invalid Email-id. Please enter in a valid format!!");
        }

        if (UserRegistrationPortal.phoneNo(phoneNo)) {
            System.out.println("Valid Phhone number!");

        } else {
            System.out.println("Invalid Phone number. Please enter in a valid format!!");
        }

        if (UserRegistrationPortal.password(password)) {
            System.out.println("Valid Password!");

        } else {
            System.out.println("Invalid password. Please enter in a valid format!!");
        }
        sc.close();

        String[] emails = {
                "abc@yahoo.com",
                "abc-100@yahoo.com",
                "abc.100@yahoo.com",
                "abc111@abc.com",
                "abc-100@abc.net",
                "abc.100@abc.com.au",
                "abc@1.com",
                "abc+100@gmail.com",
                "abc",
                "abc@.com.my",
                "abc123@gmail.a",
                "abc123@.com",
                "abc123@.com.com",
                ".abc@abc.com",
                "abc()*@gmail.com",
                "abc@%*.com",
                "abc..2002@gmail.com",
                "abc.@gmail.com",
                "abc@abc@gmail.com",
                "abc@gmail.com.1a",
                "abc@gmail.com.aa.au"
        };

        for (String e : emails) {
            System.out.println(e);
            if (UserRegistrationPortal.EmailId(e)) {
                System.out.println("Valid Email-Id!");

            } else {
                System.out.println("Invalid Email-id. Please enter in a valid format!!");
            }

        }
    }

}
