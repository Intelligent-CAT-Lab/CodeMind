import java.util.Arrays;
import java.util.Scanner;

public class p03250 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input and converting to an integer array.
        String input = scanner.nextLine();
        String[] numbersStr = input.split(" ");
        int[] abc = new int[numbersStr.length];

        for (int i = 0; i < numbersStr.length; i++) {
            abc[i] = Integer.parseInt(numbersStr[i]);
        }
        
        // Sorting the integer array.
        Arrays.sort(abc);
        
        // Concatenating the second and third integer as a string, converting back to integer and adding the first one.
        int result = Integer.parseInt(String.valueOf(abc[2]) + String.valueOf(abc[1])) + abc[0];
        
        // Printing the result.
        System.out.println(result);

        scanner.close();
    }
}