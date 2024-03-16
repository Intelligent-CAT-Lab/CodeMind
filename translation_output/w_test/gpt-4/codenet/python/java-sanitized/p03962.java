import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p03962 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();  // Read the input line
        scanner.close();
        
        // Split the input by spaces, parse them to integers, and add to a set
        Set<Integer> uniqueNumbers = new HashSet<>(
                Arrays.asList(
                        Arrays.stream(input.split("\\s+"))
                                .map(Integer::parseInt)
                                .toArray(Integer[]::new)
                )
        );
        
        // Print the size of the set (number of unique numbers)
        System.out.println(uniqueNumbers.size());
    }
}