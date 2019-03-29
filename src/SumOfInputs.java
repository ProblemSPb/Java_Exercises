// Type the numbers into the console. It will loop until you type "sum"
// then the it exits the loop and print the sums of all numbers

// Вводить с клавиатуры числа и считать их сумму,
// пока пользователь не введет слово "сумма". Вывести на экран полученную сумму.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumOfInputs {

    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int tempNum = 0;

        while (true) {

            String s = reader.readLine();

            if (s.equals("sum")) {
                System.out.println(sum);
                break;
            }
            else {
                tempNum = Integer.parseInt(s);
                sum = sum + tempNum;

            }
        }
    }
}
