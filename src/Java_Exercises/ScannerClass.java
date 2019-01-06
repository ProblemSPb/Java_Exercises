package Java_Exercises;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        // scanning a poem
        Scanner scanner = new Scanner("Люблю тебя, Петра творенье,\n" +
                "Люблю твой строгий, стройный вид,\n" +
                "Невы державное теченье,\n" +
                "Береговой ее гранит");

        String line = scanner.nextLine();
        System.out.println(line);
        line = scanner.nextLine();
        System.out.println(line);
        line = scanner.nextLine();
        System.out.println(line);
        line = scanner.nextLine();
        System.out.println(line);
        scanner.close();

        // validating the inputs
        // hasNextInt(), hasNextLine(), hasNextByte(), hasNextShort(),
        // hasNextLong(), hasNextFloat(), hasNextDouble()

        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nInsert a number");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("You have entered the number: " + number);
        }
        else {
            System.out.println("This is not a number.");
        }
        sc.close();

        System.out.println("\n");

        // useDelimeter()
        // разделитель

        Scanner scan = new Scanner("Anna Mills/Female/20");
        scan.useDelimiter("/");

        while (scan.hasNext()) {
            System.out.println(scan.next());
        }
        scan.close();

    }
}
