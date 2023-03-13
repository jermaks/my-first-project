package classroom;

import java.sql.SQLOutput;

public class ObjectExample {

    public static void main(String[] args) {

        Cat barsik = new Cat("Barsik");
        System.out.println(barsik.getAge());
        System.out.println(barsik);

        barsik.setAge(4);
        System.out.println(barsik.getAge());

        barsik.speak();
        barsik.feed();

        // Create getters and setters for: weight;
        // For all other fields create getter method;

        barsik.setWeight(8.5);
        System.out.println(barsik.getWeight());
        System.out.println(barsik);

        // Create constructor with name, color, breed, gender, hasFur. - done
        // Create cat with all these field passed into constructor. - done
        // Print your cat. - done

        Cat murzik = new Cat("Murzik", "White", "Russian Blue", "Male", true);
        murzik.setAge(4);
        murzik.setWeight(2.5);
        System.out.println(murzik);

        System.out.printf("My cat's name is: %s. My cat is %d years old.\n", murzik.getName(), murzik.getAge());

        murzik.walk();
        murzik.walk();
        murzik.walk();
        murzik.walk();
        murzik.walk();
        murzik.walk();
        System.out.println(murzik.getEnergy());

        // Update method feed, so we can feed our cat; - done
        // Every feed method call increase energy for 1; - done

        murzik.feed();
        murzik.feed();
        murzik.feed();
        murzik.feed();
        murzik.feed();
        murzik.feed();
        System.out.println(barsik.getEnergy());

    }

}
