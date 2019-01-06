// calculates which of the two given nums is closer to 50.

package Java_Exercises;

public class NumClosestTo50 {

    public static void main(String[] args) {

        closest50(10, 40);
        closest50(60, 40);
        closest50(1, 90);

    }

    // detects the closest to 50
    public static void closest50 (int a, int b) {

        if (minus(50  - a) < minus(50 - b)) {
            System.out.println(a + " is closer to 50 than " + b);
        }
        else if (minus( 50 - a) > minus(50 - b)) {
            System.out.println(b + " is closer to 50 than " + a);
        }
        else {
            System.out.println("Both numbers are equally close to 50: " + a + ", " + b);
        }
    }


    // converts the negative num into a positive one
    public static int minus(int a) {

        if (a < 0) {
            return -a;
        }
        else {
            return a;
        }

    }

}
