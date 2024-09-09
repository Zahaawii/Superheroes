import java.util.Scanner;

public class startOver {

    static Scanner scanner = new Scanner(System.in);

    public static boolean startover(boolean startOver) {

        System.out.println("Do you want to start over. Press Y/N");
        String userStartOver = scanner.nextLine();

        if(userStartOver.equalsIgnoreCase("Y")) {
            startOver = true;
            UserDecision.UserChoice();
        } else {
            startOver = false;
            System.out.println("Shutting down");
            System.exit(0);
        }
        return startOver;

    }
}
