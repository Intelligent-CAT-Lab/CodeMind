import java.util.Scanner;

public class p03359 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Read the entire line as a string
        String line = scanner.nextLine().trim();
        
        // Split the line by space to get individual strings
        String[] numbers = line.split(" ");
        
        // Convert strings to integers
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        
        // Close the scanner
        scanner.close();
        
        // Condition check and print the result
        if (a > b) {
            System.out.println(a - 1);
        } else {
            System.out.println(a);
        }
    }
}