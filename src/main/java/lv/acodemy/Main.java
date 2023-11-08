package lv.acodemy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello everyone!");

        // int (number)
        int myCurrentAge = 29;
        System.out.println(myCurrentAge);

       /*
       This is
       comment approach
        */

        byte myWeight = 80;
        System.out.println(myWeight);

        short salary = 7000;
        System.out.println(salary);

        char myFirstLetterOfName = 'D';// character data type
        System.out.println(myFirstLetterOfName);
        long populationOfLatvia = 1900000; // long data type

        double numberPi = Math.PI; // PI NUmber
        float randomNumber = 313813.1313f; // float number
        double classicFloatingNumber = 231937182.313448595; // double number

        //Boolean true/false is, has
        // Example: isSummer, isAdult, hasEnoughAge, hasProperValue;
        boolean isSummer = false;
        boolean isAutumn = true;

        // Exercise 1.
        // Create 2 variables for each data type
        // Variable should be meaningful as it possible
        // Variable name should contain at least 2 words
        // Print all the variable values
        // lower camel case

        byte myRoomNumber = 41;
        byte myFloorNumber = 6;
        System.out.println(myRoomNumber);
        System.out.println(myFloorNumber);

        short highestMountain = 8848;
        short challengerDeep = 11022;
        System.out.println(highestMountain);
        System.out.println(challengerDeep);

        char myFirstClassLetter = 'A';
        char myLastNameFirstLetter = 'B';
        System.out.println(myFirstClassLetter);
        System.out.println(myLastNameFirstLetter);

        long thePopulationOfGermany = 84270625;
        long thePopulationOfRussia = 146447424;
        System.out.println(thePopulationOfGermany);
        System.out.println(thePopulationOfRussia);


        int x, y, z;
        x = 3;
        y = 4;
        z = 4;

        int summa = x + y + z;
        System.out.println(summa);

        int summaExample = 10 + 5 + x + y + 4 + z;
        System.out.println(summaExample);

        // 2a(a + b); result
        int a = 4;
        int b = 3;
        int result = 2 * a * (a + b);
        System.out.println(result);

        int remainder = 10 % 3;
        System.out.println(remainder);

        //String (non-primitive)

        String firstName = "Deniss";
        String lastName = "Belyaev";
        String nickName = "Deni";

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(nickName);

        System.out.println(firstName + " " + lastName + " " + nickName);

        System.out.printf("My full name is: %s %s %s\n", firstName, lastName, nickName);

        String mySchool = "L2V";
        System.out.println("Now I am currently studying in: " + mySchool + "!");
        System.out.printf("Now I am currently studying in: %s!\n", mySchool);


        // Exercise 2
        // Create two-three String variables
        // Combine (concatenate)
        // Print result out
        // Example: Today is Monday. Soon I will go home;

        String BrandOfTheCar = "JEEP";
        String ModelOfTheCar = "GRAND JHEROKEE";

        System.out.println(BrandOfTheCar);
        System.out.println(ModelOfTheCar);

        System.out.println(BrandOfTheCar + " " + ModelOfTheCar);

        System.out.printf("My favoritе car brand is: %s %s\n", BrandOfTheCar, ModelOfTheCar);

        System.out.printf("Today is Thursday. " + "Soon I will go home.");


    }
}