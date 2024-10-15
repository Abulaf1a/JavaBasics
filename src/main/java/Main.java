import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String name;

        name = "Hello Peter";

        System.out.println(name);

        int birthYear = 2000;

        System.out.println("I was born in the year" + birthYear);

        double pi = 3.14;

        System.out.println(pi);

        boolean learningJava = true;

        System.out.println(learningJava);

        String favouriteFilm = "Wallace and Gromit";

        System.out.println("My favourite film is " + favouriteFilm);

        favouriteFilm = "Hannah Montana: The Movie";

        System.out.println("Wait, actually no it's " + favouriteFilm);


        String firstName = "Pete";
        printGreeting(firstName);

        int result = subtract(1003, 231);

        System.out.println(result);


        System.out.println(isStringLongerThan("hello", 4)); //expected true

        System.out.println(isStringLongerThan("hello", 5)); //expected false

        System.out.println( isStringLongerThan("hello", 6)); //expected false



    }


    private static void printGreeting(String input){
        System.out.println("Hello " + input);
    }

    private static int subtract(int a, int b){
        return a-b;
    }

    private static boolean isStringLongerThan(String string, int lengthCheck){
        return string.length() > lengthCheck;
    }
}
