Here is the translated Java code based on the given Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] x = new int[input.length];
        for (int i = 0; i < x.length; i++) {
            x[i] = Integer.parseInt(input[i]);
        }
        int a = x[0];
        int b = x[1];
        System.out.print(minValue(x) + " â– ");
        if (Math.abs(a - b) >= 2) {
            System.out.println(Math.abs(a - b) / 2);
        } else {
            System.out.println(0);
        }
        scanner.close();
    }

    public static int minValue(int[] array) {
        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
}
```

Please note the following changes to match the functionality of the Python code to Java syntax:
- The `min()` function is not built into Java, so I wrote a small utility function to find the minimum value in an array of integers.
- The `abs()` function is `Math.abs()` in Java.
- Division in Java defaults to integer division when both operands are integers, similar to `//` in Python.
- The `end=" ▁ "` parameter in `print` is replaced with a `System.out.print()` call, since there's no direct equivalent in Java for printing with a specific ending.
- The Python `input()` function is replaced with a `Scanner` object to read input from the standard input (console).
- The character "▁" may not display correctly in certain encodings or fonts, so ensure that the Java environment supports the character or replace it with another character if necessary.

