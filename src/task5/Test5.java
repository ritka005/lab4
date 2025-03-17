package task5;
import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static <T> List<T> filterList(List<T> list, Filter5<T> filter) {
        List<T> filteredList = new ArrayList<>();
        for (T element : list) {
            if (filter.test(element)) {
                filteredList.add(element);
            }
        }
        return filteredList;
    }
}
