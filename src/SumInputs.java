// Type numbers to console
// after -1 the input is not accepted anymore and all the previous numbers are summed
// including -1

import java.util.Scanner;

public class SumInputs {

        public static void main(String[] args) throws Exception {

            Scanner input = new Scanner(System.in);
            int sum = 0;

            while (true) {

                int num = input.nextInt();
                int num1 = num;

                sum = sum + num1;

                if (num == -1) {
                    System.out.println(sum);
                    break;
                }

            }
        }

}
