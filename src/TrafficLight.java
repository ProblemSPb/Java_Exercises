/*
Traffic light:
first 3 minutes -> green light
next 1 min -> yellow
next 1 min -> red

and then again:next 3 mins - green, next 1 min 0 yellow, next one red.

if we give a minute ==> what traffic light is on.
 */

import java.util.Scanner;

public class TrafficLight {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Give us a minute of an hour: ");
        double minute = input.nextDouble();

        if ((int)minute%5==0 ||((int)minute-1)%5==0||((int)minute-2)%5==0 ) // minutes 0 - 2.9 green
            System.out.println("green light");
        else if (((int)minute-3)%5==0)  // minutes 3 - 3.9 yellow
            System.out.println("yellow light");
        else
            System.out.println("red light");
    }
}
