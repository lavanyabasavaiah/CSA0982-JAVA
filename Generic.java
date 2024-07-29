import java.util.Collections;
import java.util.List;

public class GenericSorter<T extends Comparable<T>> {
    public static <T extends Comparable<T>> void sortAndPrint(List<T> list) {
        Collections.sort(list);
        System.out.println(list);
    }

    public static void main(String[] args) {
        sortAndPrint(List.of(3, 1, 4, 1, 5, 9)); // Sorting integers
        sortAndPrint(List.of("banana", "apple", "cherry")); // Sorting strings
    }
}
28
