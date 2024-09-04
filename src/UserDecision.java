import java.util.Scanner;

public class UserDecision {

    static Scanner scanner = new Scanner(System.in);
    static int userInput;

    public static void UserChoice() {
        UserChoiceDecision("Velkommen til Superhelte for rookies", "Du har følgende valg: \n1: For at se superhelte. \n2: For at lave din egen superhelt \n3: Slette en superhero");

        do {
            try {
                System.out.println("Tryk 1, 2 or 3");
                userInput = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                System.out.println("Tast et nummer");
                userInput = 0;
            }
        } while (userInput <= 0 || userInput >= 4);

        if(userInput == 1) {
            System.out.println("Du har valgt at se superhelte");
            ExistingSuperheroes.existingSuperheroDecision();
        }

        if(userInput == 2) {
            MakeYourOwnSuperHero.YourSuperHeroeAttributes();
        }

        if(userInput == 3) {
            System.out.println("Du har valgt at slette superhelte");
        }
    }

    public static void UserChoiceDecision(String text, String valg){
        ConsoleStuff.printSeperator(30);
        System.out.println(text);
        ConsoleStuff.printSeperator(30);
        System.out.println(valg);
    }
}
