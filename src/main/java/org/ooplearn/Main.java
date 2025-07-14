package org.ooplearn;

import org.ooplearn.encapsulation.User;
import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        // 1. Create a Scanner to read from standard input
        // 2. Declare the User Object
        Scanner input = new Scanner(System.in);
        User user = new User();
        int id;
        String name;
        String password;
        System.out.print("Enter your Id: ");
        // 3. input next line take and sting to we connverted to Integer
         id = Integer.parseInt(input.nextLine());

        // 4. Instantiate User and set the name

        user.setId(id);
        // Username
        System.out.print("Enter your name: ");

        name = input.nextLine();
        user.setName(name);

        // Password
        System.out.print("Enter your password: ");
        password=input.nextLine();
        user.setPassword(password);
        System.out.printf("Hello, %s%n", user.getName());
        System.out.printf("Your Id : %s%n", user.getId());
        System.out.printf("Than Your Hashad Password Is: %s%n", user.getPasswordHash());

        input.close();
    }
}
