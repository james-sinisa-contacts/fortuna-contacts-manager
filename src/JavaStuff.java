import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class JavaStuff {

    public static void main(final String[] args) throws IOException {
//        System.out.println("Hello World");
                try {
                    File myObj = new File("/Users/jamesspicer/Desktop/TestFolder");
                    if (myObj.createNewFile()) {
                        System.out.println(myObj.getName() + " Has been created");
                    } else {
                        System.out.println("File already exists");
                    }
                } catch(IOException e) {
                        e.printStackTrace();
                    }
                }
            }





