package application;

public class    Main {

    public static void main(String[] args) {
        System.out.println("Hello, ");
        String name;
        int age;
        boolean male;
        int BIRTH_YEAR = 1996;

        name = "Santiago";
        age = 30;
        male = true;
        int birth_year = 1995;

        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old");
        System.out.println("Am I male?" + male );

        final int CURRENTYEAR = 2026;
        int birthYear = 1995;
        int calculateAge = CURRENTYEAR - BIRTH_YEAR;
        System.out.println( "Calculated age: " + calculateAge);

        for (int i = 1; i <= 10;i++) {
            System.out.println("Itineration: " + 1) ;
        }

    }


}
