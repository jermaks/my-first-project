package classroom;

public class VariablesDataTypes {
    public static void main(String[] args) {

        // byte data type.
        byte myCurrentAge = 29;
        System.out.println(myCurrentAge);

        short muOnlineMaxStats = 32767;
        System.out.println(muOnlineMaxStats);

        char firstNameLetter = 'A';
        System.out.println(firstNameLetter);

        int dateOfBirth = 2504193;
        System.out.println(dateOfBirth);

        long populationOfLatvia = 1800000;
        System.out.println(populationOfLatvia);

        float lapTime = 32.30f;
        System.out.println(lapTime);

        double weight = 71.5;
        System.out.println(weight);

        boolean isWinter = false;
        boolean isSpring = true;

        String name = "Arturs";
        String surname = "Jermaks";
        String fullName = name + " " + surname;
        String fullNameWithAge = fullName + " " + myCurrentAge;
        System.out.println(fullNameWithAge);

        System.out.printf("My Full Name is: %s. I'm %d years old.\n", fullName, myCurrentAge);
        System.out.printf("My Full Name is: %s. I'm %d years old.\n", fullName, myCurrentAge);

        int a = 100;
        int b = 20;
        int c = a * b;
        System.out.println(c);

        c = a / b;
        System.out.println(c);

        int number = 10 % 4;
        System.out.println(number);

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println();




    }
}
