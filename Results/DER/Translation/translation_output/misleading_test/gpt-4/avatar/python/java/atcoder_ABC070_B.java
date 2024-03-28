Here is the translated Java code for the given Python snippet, including a simple way to handle the input and print the output:

```java
import java.util.Scanner;

public class OverlapCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int overlap = Math.max(0, Math.min(b, d) - Math.max(a, c));
        System.out.println(overlap);
    }
}
```

This Java code should provide the same behavior as the original Python code, including reading integers from the standard input and printing the calculated overlap to the standard output.
