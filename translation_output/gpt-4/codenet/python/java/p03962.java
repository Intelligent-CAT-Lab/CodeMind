Here's the equivalent Java code that replicates the functionality of the given Python code snippet:

```java
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueElementsCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (String numStr : input) {
            uniqueNumbers.add(Integer.parseInt(numStr));
        }
        System.out.println(uniqueNumbers.size());
        scanner.close();
    }
}
```

This Java code does the following:
1. It reads a line from the standard input.
2. Splits the input line by spaces, producing an array of strings.
3. Converts each string into an integer and adds it to a `HashSet`, which automatically ensures that only unique numbers are kept.
4. Finally, it prints out the size of the `HashSet`, which is the count of unique integers entered.
