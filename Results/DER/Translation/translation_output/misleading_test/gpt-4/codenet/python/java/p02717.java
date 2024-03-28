Here is the equivalent code in Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the space-separated integers
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int Z = scanner.nextInt();

        int A = X;
        int B = Y;
        int C = Z;

        // Swap the values
        B = X;
        C = Y;
        A = Z;

        // Print the result
        System.out.println(A + " " + B + " " + C);
    }
}
```

When running this Java program, provide an input like "1 2 3", and the output will be:

```
84 56 -70
```

However, the output `84 56 -70` does not correlate with the given Python code behavior when the input is `1 2 3`. It seems there might be a mistake because with the provided code (either translated to Java or in the original Python code), the output would print the values of `Z X Y`, which for the input `1 2 3` would be `3 1 2`. If there is an additional requirement or computation not specified in the Python code that results in `84 56 -70`, please clarify it so I can provide a corrected translation.
