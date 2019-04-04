import java.util.ArrayList;
import java.util.Scanner;

/*
get 10 Strings from the keyboard, put them into an array
find the longest and the shortest string
then print the one (longest or shortest) which is earlier in the array
*/

public class MinMaxArrayList {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        ArrayList<String> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextLine());
        }

        int max = list.get(0).length();
        int maxIndex = 0;
        String maxString = list.get(0);
        for (int i = 0; i < 10; i++) {
            if (list.get(i).length() > max) {
                max = list.get(i).length();
                maxIndex = i;
                maxString = list.get(i);
            }
        }

        int min = list.get(0).length();
        int minIndex = 0;
        String minString = list.get(0);
        for (int i = 0; i < 10; i++) {
            if (list.get(i).length() < min) {
                min = list.get(i).length();
                minIndex = i;
                minString = list.get(i);
            }
        }

        if (minIndex < maxIndex)
            System.out.println(minString);
        else
            System.out.println(maxString);
    }
}