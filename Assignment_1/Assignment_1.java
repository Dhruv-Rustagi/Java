package Assignment_1;
import java.io.File;
import java.util.*;

public class Assignment_1 {

    private void findPath() {

        // file path where we have to search
        File file = new File("C:\\Users\\Dhruv\\Videos\\Captures");

        // String to store the name of file that has to be searched
        String str;

        Scanner sc = new Scanner(System.in);

        // using do-while loop to search the file in provided path again and again, until found or not present
        do {

            // variable to check whether the file is found or not
            boolean fileFound = false;
            System.out.println("Enter the name of the file or folder that has to be searched : ");

            str = sc.nextLine();

            // Storing all files and folders in the form of an array
            String[] allFiles = file.list();

            // traversing all files or folders
            for(String string : allFiles) {

                if(str.equals(string))
                {
                    fileFound = true;
                    System.out.println("File or folder found : " + str);
                    System.out.println("Path of file or folder is : " + file.getAbsolutePath());
                    // it will print the path where we are searching for the file
                    break;
                }
            }

            if(fileFound == false)
            {
                System.out.println("File or folder not found.");
            }

            System.out.println("Search more files (Enter true or false) ??");
        } while(sc.nextBoolean());
    }
    public static void main(String[] args) {

        Assignment_1 obj = new Assignment_1();
        obj.findPath();
    }
}
