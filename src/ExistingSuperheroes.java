import java.util.ArrayList;
import java.util.Scanner;

public class ExistingSuperheroes {
    static ArrayList <String> superheroes = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    private static void superheroes() {
        superheroes.add("");
        superheroes.add("1. Batman");
        superheroes.add("2. Iron man");
        superheroes.add("3. Black panther");
        superheroes.add("4. Deadpool");
    }

    private static void superheroesDisplay() {
        superheroes();
        for(String display : superheroes)
            System.out.println(display);

    }

    private static void clearSuperhero() {
        ConsoleStuff.printSeperator(30);
        System.out.println("Do you want to clear all superheroes");
        ConsoleStuff.printSeperator(30);
        String userInput = scanner.next();
        if(userInput.equalsIgnoreCase("Yes")){
            superheroes.clear();
            System.out.println("You have cleared all superheroes");
        }
    }

    private static void deleteASuperHero() {
        ConsoleStuff.printSeperator(30);
        ConsoleStuff.displayInfo("Do you want to remove any superheroes?");
        ConsoleStuff.printSeperator(30);
        String userInput = scanner.next();
        if(userInput.equalsIgnoreCase("Yes")) {
            ConsoleStuff.displayInfo("Press the number of the superhero you want to delete");
            int userDeleteSuperHero = scanner.nextInt();
            ConsoleStuff.displayInfo("You have removed your superhero: " + superheroes.get(userDeleteSuperHero));
            superheroes.remove(userDeleteSuperHero);
        }
    }

    private static void existingSuperheroUserDecision() {
        int userInput;

        do {
            try {
                System.out.println(" ");
                ConsoleStuff.displayInfo("What superhero would you like to access?");
                userInput = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                userInput = 0;
                System.out.println("Press a number");
            }
        } while (userInput <= 0 || userInput >= 5);

        if (userInput == 1) {
            Superheroattributes batman = new Superheroattributes("Batman", "Strong man", 45);
            ConsoleStuff.printSeperator(30);
            System.out.println("You choose Batman. \nSuperhero Attributes: ");
            ConsoleStuff.printSeperator(30);
            System.out.println("1 Superhero: " + batman.name + " " + " 2 attributes: " + batman.attributes + " " + " 3 age: " + batman.age);
        }

        if(userInput == 2) {
            Superheroattributes ironman = new Superheroattributes("Iron man", "Money", 40);
            System.out.println("You choose Iron man. \nSuperhero Attributes: ");
            ConsoleStuff.printSeperator(30);
            System.out.println("1 Superhero: " + ironman.name + " " + " 2 attributes: " + ironman.attributes + " " + " 3 age: " + ironman.age);
        }

        if(userInput == 3) {
            Superheroattributes blackPanther = new Superheroattributes("Black panther", "Black supremacist", 28);
            ConsoleStuff.printSeperator(30);
            System.out.println("You choose Black Panther. \nSuperhero Attributes: ");
            ConsoleStuff.printSeperator(30);
            System.out.println("1 Superhero: " + blackPanther.name + " " + " 2 attributes: " + blackPanther.attributes + " " + " 3 age: " + blackPanther.age);
        }

        if(userInput == 4) {
            Superheroattributes deadpool = new Superheroattributes("Deadpool", "Immortality", 0);
            ConsoleStuff.printSeperator(30);
            System.out.println("You choose Deadpool. \nSuperhero Attributes: ");
            ConsoleStuff.printSeperator(30);
            System.out.println("1 Superhero: " + deadpool.name + " " + " 2 attributes. " + deadpool.attributes + " " + " 3 age: " + deadpool.age);
        }

        ConsoleStuff.printSeperator(30);
        ConsoleStuff.displayInfo("You have chosen your character");
        ConsoleStuff.pressToContinue();
    }


    public static void existingSuperheroDecision() {
        superheroesDisplay();
        existingSuperheroUserDecision();
        deleteASuperHero();
        clearSuperhero();
        startOver.startover(true);

    }
}
