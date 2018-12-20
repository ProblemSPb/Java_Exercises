public class MinOfNums {

    public static void main(String[] args) {
        System.out.println(min3(1, 2, 3));
        System.out.println(min3(-1, -2, -3));
        System.out.println(min3(3, 5, 3));
        System.out.println(min3(5, 5, 10));

        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -60, -30, 40));
        System.out.println(min(20, 10, 45, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
    
    // minimum of 3 numbers
    public static int min3(int a, int b, int c) {
        
        int min3;
        if (a < b & a < c) {
            min3 = a;
        }
        else if (b < c) {
            min3 = b;
        }
        else {
            min3 = c;
        }
        return min3; 
    }


    // minimum of 2 numbers

    public static int min(int a, int b) {

        int min;
        if (a < b) {
            min = a;
        }
        else {
            min = b;
        }
        return min;

    }

    // minimum of 2 numbers

    public static int min(int a, int b, int c, int d) {

        int min;
        if (min(a, b) < min(c, d)) {
            min = min(a, b);
        }
        else {
            min = min(c, d);
        }
        return min;
    }


}
