import java.util.Arrays;
import java.util.Scanner;

public class p03671 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading a line of input and splitting it into an array of strings
        String[] input = scanner.nextLine().split("\\s+");

        // Converting the array of strings to an array of integers
        int[] abc = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            abc[i] = Integer.parseInt(input[i]);
        }

        // Sorting the array
        Arrays.sort(abc);

        // Adding the first two elements (since the array is sorted)
        int sum = abc[0] + abc[1];

        // Printing the result
        System.out.println(sum);

        // Closing the scanner
        scanner.close();
    }
}