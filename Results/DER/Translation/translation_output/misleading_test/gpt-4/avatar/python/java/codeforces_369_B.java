Below is the Java translation of the provided Python code:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        int rem;
        int ones;
        int[] string = new int[arr[1]];
        ones = arr[5] % arr[1];
        for (int i = 0; i < arr[1]; i++) {
            string[i] = (int)Math.floor((double)arr[5] / arr[1]) + (ones > 0 ? 1 : 0);
            ones--;
        }
        if (arr[0] != arr[1]) {
            rem = arr[4] - arr[5];
            ones = rem % (arr[0] - arr[1]);
            string = java.util.Arrays.copyOf(string, arr[0]);
            for (int i = arr[1]; i < arr[0]; i++) {
                string[i] = (int)Math.floor((double)rem / (arr[0] - arr[1])) + (ones > 0 ? 1 : 0);
                ones--;
            }
        }
        for (int i : string) {
            System.out.print(" " + i + " \u25A1 "); // U+25A1 is the unicode for the white square, similar to the one in the Python code
        }
        System.out.println();
        sc.close();
    }
}
```

Please note the following distinctions:
- Java does not have a direct equivalent to Python's list comprehension.
- Java uses different syntax for casting types (e.g., `(int)Math.floor(...)`).
- Java's print method doesn't support Python's f-string syntax. I used string concatenation instead.
- Java array lengths cannot change after they are created; instead, I created a new array with the correct size when necessary and used `java.util.Arrays.copyOf`.
- In Java, floating-point division by default returns a double, so I used explicit type casting to an integer type to mimic Python's `math.floor`.
- Java doesn't have a direct counterpart to the `end` parameter of Python's `print`, so a newline character isn't added after printing.

The output of the Java program should match the Python code's output for a given test case.
