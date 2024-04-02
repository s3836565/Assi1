import java.util.Scanner;
import java.util.List;
import model.Customer;

public class MainMenu {
    private List<Customer> customerDatabase;

    // Constructor to initialize the customer database
    public MainMenu(List<Customer> customerDatabase) {
        this.customerDatabase = customerDatabase;
    }

    // Method to prompt user for name input and check if it matches any customer name in the database
    public void checkCustomerName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String enteredName = scanner.nextLine();

        boolean nameFound = false;
        for (Customer customer : customerDatabase) {
            if (customer.getFullName().equalsIgnoreCase(enteredName)) {
                nameFound = true;
                System.out.println("Name found in database.");
                // Perform further processing here
                break;
            }
        }

        if (!nameFound) {
            System.out.println("Name not found in database.");
            // Handle if the name is not found
        }
    }

    // Main method to test the MainMenu
    public static void main(String[] args) {
        // Initialize the customer database with some sample data
        // Replace this with your actual customer data retrieval logic
        List<Customer> customerDatabase = ...; // Retrieve customer data from somewhere

        // Create MainMenu object with the customer database
        MainMenu mainMenu = new MainMenu(customerDatabase);

        // Call the checkCustomerName method to start the interaction
        mainMenu.checkCustomerName();
    }
}
