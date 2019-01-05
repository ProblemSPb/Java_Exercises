// handling FIle class

package Java_Exercises;

import java.io.File;
import java.util.Date;
import java.util.stream.Stream;

public class FileClass {

    public static void main(String[] args) throws Exception {

        // File class represents the files and dirs. it's used for creation, searching and deletion.

        File input = new File("directory");
        // File input = new File("input.txt");

        File input2 = new File("input2.txt");

        System.out.println(input.exists()); // if exists => boolean
        System.out.println(input.isDirectory()); // if it is a folder
        System.out.println(input.isFile()); // if it is a file
        System.out.println(input2.createNewFile()); // creates a new one if does not exist
        System.out.println(input2.delete()); // deletes a file or an EMPTY directory

        // last modified, returns a long => create new Date object
        Date lastModified = new Date(input.lastModified());
        System.out.println(lastModified);

        // lists the names of files and dirs inside the current dir
        String[] listOfFiles = input.list();

        Stream.of(listOfFiles).forEach(f -> System.out.println(f)); // printing out the array
        System.out.println(listOfFiles[0]); // printing the index of the array
        System.out.println(listOfFiles.length);

        // lists an array of files inside the dir
        File[] listOfFiles2 = input.listFiles();
        System.out.println(listOfFiles2[0]);

        // creates a dir
        File input3 = new File("New Dir");
        input3.mkdir();

        System.out.println(input2.canRead()); // checks if the app can read from the file/dir
        System.out.println(input2.canWrite()); // checks if the app can write from the file/dir

    }

}
