import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p00018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        Arrays.stream(input.split("\\s+")) // Split input into an array of strings
                .map(Integer::parseInt)      // Convert strings to integers
                .sorted(Collections.reverseOrder()) // Sort in reverse order
                .collect(Collectors.toList()) // Collect as list to maintain the order
                .forEach(i -> System.out.print(i + " ")); // Print each number followed by a space
    }
}