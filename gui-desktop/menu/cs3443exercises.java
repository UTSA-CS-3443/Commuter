/*import java.io.File;
import java.util.Scanner;

public class cs3443exercises {
    public Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter a path to a folder: ");
        String path = s.next();
        File directory = new File(path);
        while(directory == null){
            System.out.println("Unable to open this directory");
            System.out.println("Enter another path: ");
            path = s.next();
            directory = new File(path);
        }
        File[] files = directory.listFiles();
        for (File file : files) {
            System.out.println(file.toString());
        }
    }
}*/
