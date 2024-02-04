package Tutorial;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        ListFilter filter = new ListFilter();

        List<String> names = List.of("Hugo", "Nicholas", "Jacob", "Pontus", "Alia");
        Predicate<String> startsWithA = name -> name.startsWith("A");

        boolean containsNameStartingWithA = filter.filterList(names, startsWithA);
        System.out.println(containsNameStartingWithA);
    }
}
