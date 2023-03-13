package homework;

public class SecondHomeWork {

    public static void main(String[] args) {

        /*
    1 Task:
    1. Create String array that will contain 10 European countries and include "Latvia" in this array
    1.1 Iterate through array and print all values
    1.2 Iterate through array and add following logic: IF "Latvia" exist in the array print: "Latvia is my motherland"
        */

        String[] countries = {"Lithuania", "Germany", "Estonia", "Latvia", "Poland",
                "Spain", "Italy", "France", "Austria", "Denmark"};

        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }

        for (int i = 0; i < countries.length; i++) {
            if (countries[i].equals("Latvia")) {
                System.out.println("\nLatvia is my motherland");
            }
        }

        /*
    2 Task:
    2. You have the following sentence: "Sometimes it pays to stay in bed on Monday,
    rather than spending the rest of the week debugging Monday’s code."
    2.1 Put each word into a String array.
    2.1 Using Iteration (Loops) print all values from array so as the result will be printed sentence (one line)
         */
        String[] sentence = {"Sometimes", "it", "pays", "to", "stay", "in", "bed", "on", "Monday,",
                "rather", "than", "spending", "the", "rest", "of", "the", "week", "debugging", "Monday's", "code."};

        System.out.println();
        for (int i = 0; i < sentence.length; i++) {
            System.out.print(sentence[i] + " ");
        }

        /*
       3 Task:
    Write a Java program that takes the user's salary as an argument (double) and checks
    if their salary is less than or equal to 5000,
    between 5000 and 10000, or greater than 10000.
    If their salary is less than or equal to 5000, print "Your salary is low."
    If their salary is between 5000 and 10000, print "Your salary is average."
    If their salary is greater than 10000, print "Your salary is high."
         */

        System.out.println("\n");

        double salary = 5001;

        if (salary <= 5000) {
            System.out.println("Your salary is low.");
        } else if (salary > 5000 && salary <= 10000) {
            System.out.println("Your salary is average.");
        } else {
            System.out.println("Your salary is high.");
        }

        /*
    4 Task:
    Write a Java program that takes a number as an argument (integer) and checks
    if the number is positive, negative or zero.
    If the number is positive, print "The number is positive."
    If the number is negative, print "The number is negative."
    If the number is zero, print "The number is zero."
         */

        System.out.println();

        int number = 15;

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

    }
}



