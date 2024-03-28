Certainly! Here's how the given Python code would look like in Java:

```java
import java.util.Arrays;
import java.util.Scanner;

public class SortIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        scanner.close();

        int[] s = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            s[i] = Integer.parseInt(input[i]);
        }
        
        Arrays.sort(s);

        // Assuming that the input always contains at least 3 integers.
        // Otherwise, you'd have to add additional checks.
        System.out.println(s[0] + " " + s[1] + " " + s[2]);
    }
}
```

Note that Java is statically typed and more verbose, so you need to define the array size beforehand, and use the `Scanner` class for input. The `Arrays` utility class provides the `sort` method to sort the array. Also, Java handles string concatenation with `+` operator without the need to explicitly convert integers to strings, which simplifies the print statement.
