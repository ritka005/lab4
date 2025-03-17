package task1;
//Класс функция для хранения
public class StorageUtils1 {
    public static <T> T getValueFromStorage(Storage1<T> storage, T alternativeValue) {
        return storage.getValue(alternativeValue);
    }
}