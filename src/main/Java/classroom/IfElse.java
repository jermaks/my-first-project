package classroom;

public class IfElse {
    public static void main(String[] args) {

//        boolean x = 5 > 6;
//        System.out.println(x);
//
//        if (x) {
//            System.out.println("Yes, 5 is more than 2");
//        }

        int number = 21;
        if (number % 2 == 0) {
            System.out.println("Number: " + number + " is even number");
        } else {
            System.out.println("Number: " + number + " ia NOT even number");
        }

        boolean isSummer = false;
        if (isSummer) {
            System.out.println("Summer month: June, July, August");
        }

        int age = 17;
        if (age <= 17) {
            System.out.println("You are not allowed to buy here!");
        } else if (age <= 0) {
            System.out.println("Who are you?");
        } else {
            System.out.println("Welcome to our shop!");
        }

        String name = "Zina";
        if (name.equals("John")) {
            System.out.println("Hello John!");
        } else if (name.equals("Zina")) {
            System.out.println("You are not welcome!");
        } else {
            System.out.println("Very interesting name!");
        }

        //Switch case;

        int currentMonth = 12;
        switch (currentMonth) {
            case 12:
            case 1:
            case 2:
                System.out.println("This is winter.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("This is spring.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("This is summer.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("This is autumn");
                break;
            default:
                throw new IllegalStateException("Incorrect month value: " + currentMonth);
        }

        String student1 = "John";
        String student2 = "Max";
        if (student1.equals("John") && student2.equals("Max")) {
            System.out.println("They will work together.");
        }

        var myName = "Arturs";
        var myAge = 10;

    }
}

