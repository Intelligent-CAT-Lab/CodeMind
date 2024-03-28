Below is the translation of the provided Python code into Java. This Java code assumes that you are using at least Java 8 for lambda expression support:

```java
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
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
```

Please note the following points regarding this Java code:

1. `raw_input()` is replaced by `Scanner.nextLine()` to read a line of input from the user.
2. `map(int, ...)` is replaced by `.map(Integer::parseInt)`, which does the conversion from `String` to `Integer`.
3. `sorted()` is replaced by `.sorted(Collections.reverseOrder())` to get a stream sorted in reverse order.
4. `reversed()` is handled by the aforementioned reverse sorting.
5. `print a,` is replaced by `.forEach(i -> System.out.print(i + " "))`, which prints out the integers with a space between them.
