// LinkedList and ArrayList
// Lists can contain a null
// Set for example cannot contain a null

package Java_Exercises;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();

        words.add("first element");
        words.add("second element");
        words.add("third element");
        words.add("fourth element");
        words.add("fifth element");

        printing(words);
        System.out.println("The size of the list is " + words.size() + "\n");

        words.remove(1);

        printing(words);

        words.add(String.valueOf(5));

        List words2 = new LinkedList<>(words);

        printing(words2);

        List <Integer> numbers = new LinkedList<>();

        numbers.add(1);
        numbers.add(6);
        numbers.add(0,800);

        printing(numbers);


    }

    // printing the lists
    public static void printing(List n) {
        for (int i = 0; i <n.size(); i++) {
            System.out.println(n.get(i));
        }
        System.out.println();
    }


}
