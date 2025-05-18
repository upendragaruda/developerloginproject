import java.util.Scanner;

public class SimpleLogin {
    public static void main(String[] args) {
        // Hardcoded credentials
        String correctUsername = "admin";
        String correctPassword = "password123";

        Scanner scanner = new Scanner(System.in);

        // Prompt user input
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        // Validate credentials
        if (inputUsername.equals(correctUsername) && inputPassword.equals(correctPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }

        scanner.close();
    }
}
