import java.util.ArrayList;
import java.util.List;

public class Transform {
    //задание 3.1 (метод)
    static <T, P> List<P> transformList(List<T> list, Function<T, P> function) {
        List<P> result = new ArrayList<>();
        for (T element : list) {
            result.add(function.apply(element));
        }
        return result;
    }
}