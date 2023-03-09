package classroom;

import java.util.Arrays;

public class Loops {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }

        }

        System.out.println();
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);

        }

        for (int number : numbers) {
            System.out.println(number);
        }

        // Create String array with 10 names
        // Print all names using for & for each

        String[] names = {"Nikita", "Arturs", "Eriks", "Viktorija", "Roberts", "Zane", "Andris", "Sara", "Viktors", "Santa"};

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Nikita")) {
            } else {
                System.out.println(names[i]);
            }

            for (String name : names) {
                System.out.println(name);
            }

            //do, do while

            int s = 1;
            do {
                System.out.println(i);
                i++;
            } while (i <= 10);

            s = 0;

            while (i <= 10) {
                System.out.println(i);
                s++;
            }

            int[] arrayOfNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int[] emptyArray = new int[arrayOfNum.length];

            for (int j = 0; j < arrayOfNum.length; j++) {
                emptyArray[j] = arrayOfNum[j];
                System.out.println(Arrays.toString(emptyArray));
            }

        }
    }

}



