package homework;

import java.util.Scanner;

public class FirstHomeWork {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Create 2 variables for each data types. (meaningful).
        //Concatenation (write about myself).
        //Play with operators Math.

        String firstName = "Arturs";
        String lastName = "Jermaks";
        int age = 29;
        int yearOfBirth = 1993;
        double weight = 74.5;
        double height = 1.74;

        System.out.println("Hi! My name is " + firstName + " " + lastName + ". I'm " + age + " years old. " + yearOfBirth +
                " is my year of birth. \nMy weight is " + weight + " kg, and height is " + height + " m.\n");

        System.out.println("\nHere is simple calculator.");
        System.out.print("\tEnter first number: ");
        int number = scan.nextInt();
        System.out.print("\tEnter second number: ");
        int number2 = scan.nextInt();
        System.out.println("Here is the sum of your numbers: " + (number + number2));
        System.out.println("Here is the subtraction of your numbers: " + (number - number2));
        System.out.println("Here is the multiplier of your numbers: " + (number * number2));
        System.out.println("Here is the division of your numbers: " + ((double) number / number2));

        System.out.println("\nAnd one last question!\nWhat is current Month now?");
        scan.nextLine();
        String currentMonth = scan.nextLine();

        if (currentMonth.equalsIgnoreCase("March")) {
            System.out.println("\nSpring is here! :)");
        } else {
            System.out.println("Still Winter :(");
        }

    }
}

