import java.io.Console;
import java.util.Scanner;
import java.util.ArrayList;

public class MakeYourOwnSuperHero {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList <String> superheroesAttributes = new ArrayList<>();
    static String superheroName;

    public static void makeYourOwnSuperheroDisplay(String prompt) {
        ConsoleStuff.printSeperator(30);
        System.out.println(prompt);
        ConsoleStuff.printSeperator(30);
    }


    public static void YourSuperHeroeAttributes() {

        makeYourOwnSuperheroDisplay("You have decided to make your own superhero");

        System.out.println("Give your superhero a name");
        superheroName = scanner.nextLine();

        System.out.println("Add 4 superpowers to your superhero");

        superheroesAttributes.add(scanner.nextLine());
        superheroesAttributes.add(scanner.nextLine());
        superheroesAttributes.add(scanner.nextLine());
        superheroesAttributes.add(scanner.nextLine());

        for(String attributes : superheroesAttributes) {
            ConsoleStuff.printSeperator(30);
            System.out.println("Your superhero attributes: " + attributes);
        }

        ConsoleStuff.pressToContinue();
        userChoiceToRemoveAnyAttributes();
        userChoiceToClearAttributes();
        seeYourSuperHero();
        startOver.startover(true);
    }

    public static void clearSuperheroAttributes() {
        superheroesAttributes.clear();
        System.out.println("You have removed all your attributes");
    }

    public static void userChoiceToClearAttributes() {
        System.out.println("Do you want to clear your attributes");

        String userinput = scanner.next();

        if(userinput.equalsIgnoreCase("Yes")) {
            clearSuperheroAttributes();
        }
    }

    public static void userChoiceToRemoveAnyAttributes(){
        makeYourOwnSuperheroDisplay("Do you want to remove any attributes?");
            String userInput = scanner.nextLine();

            if(userInput.equalsIgnoreCase("Yes")){

                System.out.println("Press the number of which attributes you want to remove");
                int userInputRemoveAttributes = scanner.nextInt();

                String removedAttribute1 = superheroesAttributes.remove(userInputRemoveAttributes - 1);
                System.out.println(removedAttribute1 + "Has been removed");

            }


        }
         public static void seeYourSuperHero(){
         ConsoleStuff.pressToContinue();
         System.out.println("Your characther has been created");
         ConsoleStuff.printSeperator(30);
         System.out.println("Hello " + superheroName);
         System.out.println("Your attributes: ");
         System.out.println(superheroesAttributes);
        }
}