package task6;
import java.util.List;

public class Reducer6 {
    public static <T> T reduceList(List<T> list, Function6<List<T>, T> reducer) {
        if (list == null || list.isEmpty()) return null;
        return reducer.apply(list);
    }
}
