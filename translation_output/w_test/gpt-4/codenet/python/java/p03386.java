Here is the equivalent Java code for the provided Python example. This Java code reads three integers from standard input, generates lists similar to Python's lists X and Y, and then prints the distinct sorted elements from both lists:

```java
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
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
```

To use this Java code, compile it with `javac Main.java` and run it with `java Main`, then input the test values `3 8 2`, and you should receive the expected output.
