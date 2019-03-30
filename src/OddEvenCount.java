/*
Get input from a user, count the odd and even digits in the number.
Print how many of them in the number

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddEvenCount {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {

        even = 0;
        odd = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine(); // input from a user

        char[] chars = input.toCharArray(); // gets input String into an array of char
        int[] intArray = new int[chars.length]; // defines intArray for bring chars into it

        for (int i = 0; i < chars.length; i++) { //watch the ASCII table
            intArray[i] = (int) chars[i]-48;     // chars[i] is 48 units more than what we want
        }

        for (int j = 0; j < intArray.length; j++) {
            if (intArray[j]%2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }

        System.out.println("Even: "+ even + " Odd: " + odd);
    }
}
