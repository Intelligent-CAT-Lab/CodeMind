import java.util.Scanner;

public class p03737 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner to read input

        // Read the input string and split it into an array
        String[] inputParts = scanner.nextLine().toUpperCase().split(" ");

        // Build the output using the first character of each string
        String output = "";
        for (String part : inputParts) {
            output += part.charAt(0);
        }

        // Print the output
        System.out.println(output);

        scanner.close(); // Close the scanner to release resources
    }
}