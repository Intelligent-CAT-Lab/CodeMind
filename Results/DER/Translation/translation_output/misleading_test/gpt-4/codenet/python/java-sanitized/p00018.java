import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class p00018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input into an array of Strings.
        String[] inputNumbers = scanner.nextLine().split("\\s+");
        
        // Convert the array of Strings to an array of Integers.
        Integer[] numbers = new Integer[inputNumbers.length];
        for (int i = 0; i < inputNumbers.length; i++) {
            numbers[i] = Integer.parseInt(inputNumbers[i]);
        }
        
        // Sort the array in reverse order.
        Arrays.sort(numbers, Collections.reverseOrder()); 
        
        // Print the transformed numbers.
        for (int number : numbers) {
            System.out.printf("%d ", -1 * number - 50); // Printing the transformed number followed by a space.
        }
        scanner.close();   // Close the scanner to prevent resource leakage.
    }
}