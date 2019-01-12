// print the files'names if they start with specific letters

import java.io.File;

public class FileNameFilter {

    public static void main(String[] args) {

        File input = new File("New Dir");

        String[] listOfFileNames = input.list();

        for (int i = 0; i <10; i++) {

            if (listOfFileNames[i].startsWith("text")) {
                System.out.println(listOfFileNames[i]);
            }
        }

        for (int k = 0; k < 10; k++) {

            if (listOfFileNames[k].startsWith("file")) {
                System.out.println(listOfFileNames[k]);
            }
        }

    }
}
