import task1.Storage1;
import task1.StorageUtils1;
import task4.Transform4;
import task5.Test5;
import task6.Reducer6;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("1.2.Задание. Без null.");
        // Хранилище чисел с null
        Storage1<Integer> intStorageNull = new Storage1<>(null);
        System.out.println(StorageUtils1.getValueFromStorage(intStorageNull, 0)); // 0

        // Хранилище чисел с 99
        Storage1<Integer> intStorageNum = new Storage1<>(99);
        System.out.println(StorageUtils1.getValueFromStorage(intStorageNum, -1)); // 99

        // Хранилище строк с null
        Storage1<String> stringStorageNull = new Storage1<>(null);
        System.out.println(StorageUtils1.getValueFromStorage(stringStorageNull, "default")); // default

        // Хранилище строк с "hello"
        Storage1<String> stringStorageHello = new Storage1<>("hello");
        System.out.println(StorageUtils1.getValueFromStorage(stringStorageHello, "hello world")); // hello

        System.out.println("3.1.Задание Получение списка длин следующих строк: \"qwerty\", \"asdfg\", \"zx\"\n");
        List<String> strings = List.of("qwerty", "asdfg", "zx");
        List<Integer> lengths = Transform4.transformList(strings, String::length);
        System.out.println("Результат: " + lengths);
        System.out.println("\nПреобразование отрицательных чисел в положительные\nДан список со значениями: 1,-3,7");
        List<Integer> numbers = List.of(1, -3, 7);
        List<Integer> positiveNumbers = Transform4.transformList(numbers, n -> Math.abs(n));
        System.out.println("Результат: " + positiveNumbers);
        System.out.println("\nПолучение списка максимальных значений массивов\nМассивы:");
        List<int[]> arrays = List.of(
                new int[]{1, 2, 3},
                new int[]{-1, -2, -3},
                new int[]{5, 0, 1}
        );
        for (int[] arr : arrays) {
            System.out.print(Arrays.toString(arr) + "\n");
        }
        List<Integer> maxValues = Transform4.transformList(arrays, arr -> {
            int max = arr[0];
            for (int value : arr) {
                if (value > max) {
                    max = value;
                }
            }
            return max;
        });
        System.out.println("Результат: " + maxValues);


        System.out.println("3.2.Задание Фильтрация строк с длиной менее 3 символов.Строки: \"qwerty\", \"asdfg\", \"zx\"\n");
        List<String> strings1 = List.of("qwerty", "asdfg", "zx");
        List<String> filteredStrings = Test5.filterList(strings1, s -> s.length() >= 3);
        System.out.println("Результат: " + filteredStrings);
        System.out.println("\nФильтрация положительных целых чисел\nДан список со значениями: 1,-3,7");
        List<Integer> numbers1 = Arrays.asList(1, -3, 7);
        List<Integer> filteredIntegers = Test5.filterList(numbers1, n -> n <= 0);
        System.out.println("Результат: " + filteredIntegers);
        System.out.println("\nФильтрация массивов целых чисел с положительными элементами\nМассивы: ");
        List<int[]> arrays1 = List.of(
                new int[]{-1, -2, -3},
                new int[]{1, 2, 3},
                new int[]{0, -4, -5}
        );
        for (int[] arr : arrays1) {
            System.out.print(Arrays.toString(arr) + "\n");
        }
        List<int[]> filteredArrays = Test5.filterList(arrays1, arr -> {
            for (int num : arr) {
                if (num > 0) {
                    return false;
                }
            }
            return true;
        });
        System.out.println("Результат:");
        for (int[] arr : filteredArrays) {
            System.out.println(Arrays.toString(arr));
        }


        System.out.println("3.3.Задание Объединение строк.\nСтроки: \"qwerty\", \"asdfg\", \"zx\"\n");
        List<String> strings2 = List.of("qwerty", "asdfg", "zx");
        String concatenatedString = Reducer6.reduceList(strings2, s -> String.join("", s));
        System.out.println("Результат: " + concatenatedString);
        System.out.println("\nСумма элементов списка.\nДан список со значениями: 1,-3,7");
        List<Integer> numbers2 = List.of(1, -3, 7);
        Integer sum = Reducer6.reduceList(numbers2, list -> {
            int sum0 = 0;
            for (Integer num : list) {
                sum0 += num;
            }
            return sum0;
        });
        System.out.println("Результат: " + sum);
        System.out.println("\nОбщее количество элементов в списках.\nСписки:");
        List<List<Integer>> listOfLists = List.of(
                List.of(1, 2),
                List.of(3, 4, 5),
                List.of(6)
        );
        for (List<Integer> list : listOfLists) {
            System.out.println(Arrays.toString(list.toArray()));
        }
        Integer totalElements = Reducer6.reduceList(Transform4.transformList(listOfLists,List::size), list -> {
            int count = 0;
            for (Integer sublist : list) {
                count += sublist;
            }
            return count;
        });
        System.out.println("Результат: " + totalElements);

    }
}