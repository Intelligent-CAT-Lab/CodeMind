import java.util.Scanner;

public class p00006 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reads input from the user
        String input = scanner.nextLine();
        
        // Closes the scanner to prevent resource leaks
        scanner.close();
        
        // Create a StringBuilder instance with the input string
        StringBuilder reversedInput = new StringBuilder(input);
        
        // Reverse the string using the reverse() method
        reversedInput.reverse();
        
        // Print the reversed string
        System.out.println(reversedInput.toString());
    }
}