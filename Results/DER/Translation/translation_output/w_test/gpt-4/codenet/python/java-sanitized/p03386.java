import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class p03386 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int K = scanner.nextInt();

        Set<Integer> numbers = new HashSet<>();

        // Add elements from A to A+K if they are less than or equal to B
        for (int p = A; p < A + K && p <= B; p++) {
            numbers.add(p);
        }

        // Add elements from B-K+1 to B if they are greater than or equal to A
        for (int q = B - K + 1; q <= B && q >= A; q++) {
            numbers.add(q);
        }

        // Convert to a list and sort
        List<Integer> sortedNumbers = new ArrayList<>(numbers);
        Collections.sort(sortedNumbers);

        // Print the sorted list of numbers
        for (int number : sortedNumbers) {
            System.out.println(number);
        }

        scanner.close();
    }
}