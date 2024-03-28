Below is the equivalent Java code for the given Python code. The Java code uses a `Scanner` object for input and replaces list comprehension with nested loops to initialize the array.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[][] num = new int[10][10]; // In Java, the default initialization is to 0

        for (int i = 1; i <= N; i++) {
            if (i % 10 > 0) {
                String strI = Integer.toString(i);
                int firstDigit = Character.getNumericValue(strI.charAt(0));
                num[firstDigit][i % 10]++;
            }
        }

        // The print statement for the array is commented out
        // If you want to print the array, you'll have to do it using nested loops

        long c = 0; // Use long to avoid integer overflow for large calculations
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                c += (long) num[i][j] * num[j][i];
            }
        }
        System.out.println(c);

        scanner.close();
    }
}
```

Please note the following changes:
- The `Scanner` class is used to read from standard input in Java.
- Java arrays are initialized with a default value of 0 for integers, so we don't need to initialize them explicitly as in the Python code.
- When dealing with potentially large sums, `long` is used instead of `int` to avoid overflow.
- The `raw_input` from Python is replaced with `Scanner.nextInt`.
- In Java, we don't have a direct equivalent of `raw_input`, so we use `Scanner.nextLine()` followed by parsing to an integer if needed to mimic `raw_input()`, but here I've just used `nextInt()` to read the integer directly.
- Java does not support the Python style of multi-line comment using `'''`, so I've used the usual `//` for single-line comments. If you need to output the array, you will need to write nested loops to print each element, as Java doesn't have a straightforward way to print the whole array like Python's `print` function.
