/*Задан массив строк. Используя средства StreamAPI
отсортировать строки в лексикографическом порядке*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        String[] as = {"window", "food", "milk", "support", "photograph", "road", "map", "tennis", "metal", "dance", "atmosphere", "kangaroo"};
        ArrayList<String> al = new ArrayList<String>(as.length);
        for (int i = 0; i < as.length; i++){
            al.add(i, as[i]);
        }
        Stream<String> stream = al.stream();
        Stream<String> streamSorted1 = stream.sorted();
        Consumer<String> action = (str) -> {
            System.out.println(str);
        };
        streamSorted1.forEach(action);
        Comparator<String> comparator = (str1, str2) -> {return str2.compareTo(str1);};
        stream = al.stream();
        Stream<String> streamSorted2 = stream.sorted(comparator);
        System.out.println("-----------------------------------");
        streamSorted2.forEach(action);
    }
}
