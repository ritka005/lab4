package task1;
//Класс хранилище
public class Storage1 <T> {
    private final T object;
    public Storage1(T object) {
        this.object = object;
    }
    public T getValue(T alternativeValue) {
        return object != null ? object : alternativeValue;
    }
}