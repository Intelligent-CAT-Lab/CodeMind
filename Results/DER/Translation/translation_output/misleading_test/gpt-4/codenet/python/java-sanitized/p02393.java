import java.util.Arrays;
import java.util.Scanner;

public class p02393 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Read a line of input and split it into an array of strings
        String[] inputs = scanner.nextLine().split(" ");
        
        // Close the scanner
        scanner.close();

        // Convert the string array to an array of integers
        int[] numbers = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            numbers[i] = Integer.parseInt(inputs[i]);
        }

        // Sort the array of numbers
        Arrays.sort(numbers);
        
        // Print out the sorted numbers followed by 90
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("90");
    }
}