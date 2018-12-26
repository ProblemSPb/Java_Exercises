// two variants of reading a file
// writing to a file
// renaming and deleting files

package Java_Exercises;

import java.io.*;

public class FileHandlingDemo {

    public static void main(String[] args) {

        String line;
        BufferedReader reader = null;

        try {
            // wrapping a BufferedReader object around a FileReader object
            reader = new BufferedReader(new FileReader("/Users/admin/Documents/Projects/java-tutorial/file_tutorial.txt"));
            line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            }
            catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        // another variant of reading a file
        // we moved the statement BufferedReader reader1 = new BufferedReader(new FileReader(file.name))
        // we placed it within a pair of parenthesis after the try keyword
        // in this case do NOT HAVE TO explicitly CLOSE the BufferedReader object.
        // it is called "try-with-resources" statement

        String line1;

        try (BufferedReader reader1 = new BufferedReader(new FileReader("/Users/admin/Documents/Projects/java-tutorial/file_tutorial2.txt"))) {
            line1 = reader1.readLine();
            while (line1 != null) {
                System.out.println(line1);
                line1 = reader1.readLine();
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // writing to a file

        String text = "Hello world!"; // text will be added every time we run the program

        // If the file exists, the program will append whatever new data you want to write to the original file
        // (because we indicated TRUE for the second argument).
        // FALSE will overwrite the existing data
        // if the 2nd argument is ommited, it will overwrite by default

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("MyFile2.txt", true))) {
            writer.write(text); // writes the text to t he file
            writer.newLine();   // moves the curser to the next line
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // renaming files
        File f = new File("MyFile.txt3");
        File nf = new File("MyNewFile3");

        f.renameTo(nf); // renaming the file "f" to "nf"

        nf.delete(); // deleting file nf
    }
}
