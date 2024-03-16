Here's the Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        
        int time = 1900 * M + (N - M) * 100;
        int totalTime = time * (int)Math.pow(2, M);

        System.out.println(totalTime);

        scanner.close();
    }
}
```

Here's a breakdown of the translation:

- Imported `Scanner` for input, in place of the Python `input()` function.
- Used `split()` to separate the input string by spaces, equivalent to `.split()` in Python.
- Parsed the integer values from the input using `Integer.parseInt()`.
- Calculated `time` similarly to the Python code.
- Used `Math.pow()` for the exponentiation, casting the result to an `int`. In Java, `Math.pow()` returns a `double`, so it's important to cast it if you're expecting an integer result.
- Printed the final output with `System.out.println()`.
- Added `scanner.close()` to close the scanner object to avoid resource leakage.
