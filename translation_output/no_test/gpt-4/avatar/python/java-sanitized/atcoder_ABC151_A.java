import java.util.Scanner;

public class atcoder_ABC151_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input
        System.out.println("Enter a character: ");
        char inputChar = scanner.next().charAt(0); // Read the first character of the input string

        char nextChar = (char) (inputChar + 1); // Increment the character by one
        System.out.println(nextChar); // Output the result

        scanner.close(); // Close the scanner
    }
}