import java.util.ArrayList;
import java.util.Scanner;

public class SearchSuperheroes {

    static ArrayList <String> searchSuperheroes = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    private static ArrayList allSuperheroes() {
        searchSuperheroes.add("Batman");
        searchSuperheroes.add("Iron man");
        searchSuperheroes.add("Hulk");
        searchSuperheroes.add("Spiderman");
        searchSuperheroes.add("Black widow");
        searchSuperheroes.add("Superman");

        return searchSuperheroes;
    }

    public static String searchfunction(String name) {
        allSuperheroes();
        String doesNotExist = "Superhero does not exist";
        for(String findOne : searchSuperheroes) {
            if(findOne.equals(name)) {
                return findOne;
            }

        }
        return doesNotExist;
    }

    public static void finalSearch() {
        System.out.println("Tast superhelten du vil finde");
        System.out.println(SearchSuperheroes.searchfunction(scanner.nextLine()));

    }
}
