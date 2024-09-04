import java.util.Scanner;

public class ConsoleStuff {

    static Scanner scanner = new Scanner(System.in);

    public static void printSeperator(int n) {
        for(int i = 0; i < n; i++)
            System.out.print("-");
        System.out.println();

    }

    public static void displayInfo(String prompt){
        System.out.println(prompt);
    }

    public static void ClearConsole() {
        for (int i = 0; i < 100; i++){
            System.out.println(" ");
        }
    }

    public static void pressToContinue() {
        System.out.println("Press to continue");
        scanner.next();
        ClearConsole();
    }
}
