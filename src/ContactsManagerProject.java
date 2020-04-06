import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//import static java.nio.file.Paths.get;

public class ContactsManagerProject {

    public static void main(String[] args) throws IOException {

        //displayInfo method below (home screen):
        displayInfo();

    }
    //end of main


    //home "page" method
    public static void displayInfo() throws IOException {
        System.out.println("Welcome to da contactzzz\n");

        Scanner menuInput = new Scanner(System.in);

        int userInput;
        boolean displayInfo = true;

        do {
            System.out.println("Select an option below:");
            System.out.println("\t[1] View contacts.");
            System.out.println("\t[2] Add a new contact.");
            System.out.println("\t[3] Search a contact by name.");
            System.out.println("\t[4] Delete an existing contact.");
            System.out.println("\t[5] Exit program.");
            userInput = menuInput.nextInt();

            if (userInput == 1) {
                System.out.println("\n\tContacts are listed below:");
                displayContacts();
                displayInfo = false;
            } else if (userInput == 2) {
                System.out.println("\n\tPlease enter name of new contact:");
                addContactName();
                addContactNumber();
                displayInfo = false;
            } else if (userInput == 3) {
                System.out.println("\n\tEnter contact name below to begin search:");
                displayInfo = false;
            } else if (userInput == 4) {
                System.out.println("\n\tWhich contact would you like to delete?");
                displayInfo = false;
            } else if (userInput == 5) {
                System.out.println("\n\tGoodbaiii");
                displayInfo = false;
            } else {
                System.out.println("Not a valid input; please select from inputs 1 through 5");

            }
        } while (displayInfo);
    }


    //Option 1 method:
    public static void displayContacts() throws IOException {
        Path contactPath = Paths.get("data", "contacts.txt");
        if (!Files.exists(contactPath)) {
            throw new IOException("File doesn't exist");
        }

        List<String> fileLines = Files.readAllLines(contactPath);
        System.out.println(fileLines);
    }


//Option 2 method:

    public static void addContactName() throws IOException {
        Scanner Input = new Scanner(System.in);
        String name = Input.nextLine();

        try {
            List<String> newContact = Arrays.asList(name);
            Path filepath = Paths.get("data", "contacts.txt");
            Files.write(filepath, newContact, StandardOpenOption.APPEND);

        } catch (IOException e) {
            System.out.println("Error in addContact");
        }

        addContactNumber();
    }

    public static void addContactNumber() throws IOException {
        System.out.println("Enter contact phone number dude!");
        Scanner Input = new Scanner(System.in);
        String number = Input.nextLine();

        try {
            List<String> newNumber = Arrays.asList(number);
            Path filepath = Paths.get("data", "contacts.txt");
            Files.write(filepath, newNumber, StandardOpenOption.APPEND);

        } catch (IOException e) {
            System.out.println("Error in addContact");
        }
        displayContacts();
        displayInfo();
    }

    //Option 3 method:
//    public static void searchContacts() {
//        Path contactPath = Paths.get("data", "contacts.txt");
//        Scanner search = new Scanner(System.in);
//        boolean searching = true;
//        String input;
//
//        do {
//            System.out.println("Enter name you're searching for: ");
//            input = search.nextLine();
//
//            if (contactPath.equals(input)) {
//                System.out.println(contactPath.startsWith(input));
//                searching = false;
//            } else {
//                System.out.println("Name not found, try again");
//            }
//        } while (searching);
//
//    }

}