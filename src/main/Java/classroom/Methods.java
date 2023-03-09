package classroom;

public class Methods {

    public static void main(String[] args) {
        printText("Hello", 30);
        String artursStory = myStory("Arturs", "Jermaks", 29);
        System.out.println(artursStory);

    }

    public static void printText(String text, int loopCount) {
        for (int i = 0; i < loopCount; i++) {
            System.out.println(text);
        }
    }

    public static String myStory(String name, String lastName, int age) {
        return "My name is " + name + " " + lastName + ". I'm " + age + " years old.";
    }

}
