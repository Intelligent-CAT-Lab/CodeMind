Here's the Python code translated into Java. Make sure that the input is provided in a similar way as in the test case you mentioned.

```java
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueNumbers {
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
```

To provide input and get the output, you can run this code using a Java environment. When running the program, enter the input (for example `3 1 4`) and then hit Enter. The program will output `3` as expected.
