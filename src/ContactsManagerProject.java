import java.sql.SQLOutput;
import java.util.Scanner;

public class ContactsManagerProject {

    public static void main(String[] args){
        displayInfo();

    }


    public static void displayInfo() {
        boolean displayInfo;
        do{

            displayInfo = true;
        System.out.println("Welcome to da contactzzz");
        Scanner menuInput = new Scanner(System.in);
        int userInput;

        System.out.println("Select an option below:\n");
        System.out.println("\t[1] View contacts.");
        System.out.println("\t[2] Add a new contact.");
        System.out.println("\t[3] Search a contact by name.");
        System.out.println("\t[4] Delete an existing contact.");
        System.out.println("\t[5] Exit program.");
        userInput = menuInput.nextInt();

        if (userInput == 1) {
            System.out.println("Contacts are listed below:");
        } else if (userInput == 2) {
            System.out.println("Please enter name of new contact:");
        } else if (userInput == 3) {
            System.out.println("Enter contact name below to begin search:");
        } else if (userInput == 4) {
            System.out.println("Which contact would you like to delete?");
        } else if (userInput == 5) {
            System.out.println("Thank you fo");
        } else {
            System.out.println("Not a valid input; please select from inputs 1 through 5");
            displayInfo = false;
        }
        } while (displayInfo);


    }
}
