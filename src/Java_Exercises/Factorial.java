// factorial: recursion and for loop

package Java_Exercises;

import java.util.Scanner;

class Calculation
{
    int fact(int n)
    {
        int result;

        if(n==1 || n ==0)
            return 1;

        result = fact(n-1) * n;
        return result;
    }
}

public class Factorial
{
    public static void main(String args[])

    {
        Calculation obj_one = new Calculation();

        int a = obj_one.fact(4);
        System.out.println("The factorial of the number is : " + a);


        // for loop factorial

        Scanner input = new Scanner(System.in);
        System.out.println("Insert num: ");
        int num = input.nextInt();
        int intermResult = 1;

        if (num < 0)
            System.out.println("No factorial exists");
        for (int i = 1; i <= num; i++) {
            intermResult = i * intermResult;
        }
        System.out.println(intermResult);

    }
}

    /*
    fact(4)
    fact(3) * 4;
    (fact(2) * 3) * 4;
    ((fact(1) * 2) * 3) * 4;
    ((1 * 2) * 3) * 4;
     */