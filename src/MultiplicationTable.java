// printing out the multiplication table

public class MultiplicationTable {

    public static void main(String[] args) {

        int [][] twoDArray = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},};

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }
    }
}
