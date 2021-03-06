// printing out the multiplication table

public class MultiplicationTable {

    public static void main(String[] args) {

        int [][] twoDArray = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},};

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {

                int m1 = twoDArray[0][i];
                int m2 = twoDArray[1][j];
                System.out.print((m1 * m2) + " ");
            }
            System.out.println();
        }

        // solution without arrays

        System.out.println();
        
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }
    }
}
