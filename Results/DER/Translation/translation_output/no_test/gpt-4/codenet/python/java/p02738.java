Here is the translated version of the Python code to Java. Note that Java does not have built-in support for array manipulation like Python's Numpy library, so some of the operations like `roll` must be implemented manually. Additionally, Java is more verbose and requires explicit type declarations, as well as the definition of the class and the `main` method where the program execution begins.

Here's how you can translate the given Python code to Java:

```java
import java.io.*;
import java.util.*;

public class NumpyArrayEquivalent {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int M = scanner.nextInt();
        int l = n * 3 + 1;
        long[][] d = new long[l][n * 5];
        d[0][0] = 1;

        for (int i = 1; i < l; i++) {
            int j = i - 1;
            int k = i - 2;
            // Equivalent of d[i-3]*k operation
            for (int m = 0; m < d[j].length; m++) {
                d[i][m] = (d[i][m] + d[i - 3][m] * k) % M;
            }
            // Equivalent of roll(d[k], -1) operation
            long[] rolledLeft = roll(d[k], -1);
            // Equivalent of roll(d[j], 1) operation
            long[] rolledRight = roll(d[j], 1);
            // Addition, multiplication, and modulo operations
            for (int m = 0; m < d[j].length; m++) {
                d[i][m] = (d[i][m] + rolledLeft[m] * j + rolledRight[m]) % M;
            }
        }

        // Sum of elements in the last row up to l (exclusive)
        long sum = 0;
        for (int i = 0; i < l; i++) {
            sum = (sum + d[l - 1][i]) % M;
        }
        System.out.println(sum);
    }

    // Method to perform the roll operation on an array
    private static long[] roll(long[] array, int shift) {
        int length = array.length;
        long[] result = new long[length];
        for (int i = 0; i < length; i++) {
            int newIndex = (i + shift) % length;
            if (newIndex < 0) {
                newIndex += length;
            }
            result[newIndex] = array[i];
        }
        return result;
    }
}
```

Please ensure that you import the necessary classes for I/O operation when using the above code. This translation assumes that the input will be provided in the same manner as the Python code would expect, i.e., two integers separated by a space in a single line.

Keep in mind that `int64` in Python was translated to `long` in Java to accommodate the large integer size. Java arrays are also initialized to zero by default, so there was no need to explicitly set all values to zero as with `zeros((l, n*5), int64)` in Python.
