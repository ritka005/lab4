package task4;
import java.util.ArrayList;
import java.util.List;

public class Transform4 {
    public static <T, P> List<P> transformList(List<T> list, Function4<T, P> function) {
        List<P> result = new ArrayList<>();
        for (T element : list) {
            result.add(function.apply(element));
        }
        return result;
    }
}
