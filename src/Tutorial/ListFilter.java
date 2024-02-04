package Tutorial;

import java.util.List;
import java.util.function.Predicate;

public class ListFilter {
    public boolean filterList(List<String> list, Predicate<String> predicate) {
        for (String item : list) {
            if (predicate.test(item)) {
                return true;
            }
        }
        return false;
    }
}