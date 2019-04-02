import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayMethods {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        System.out.println(max(array));
    }

    public static int[] initializeArray() throws IOException {
        // create the array
        int[] array = new int[20];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            array[i] = input.nextInt();
        }

        return array;
    }

    public static int max(int[] array) {
        // find a max value
        Arrays.sort(array);
        return array[19];
    }
}