Here's the Python code translated to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anti = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int l = Math.abs(anti - c);
        int m = Math.abs(b - d);
        
        if (anti == c) {
            System.out.println((anti + m) + " " + b + " " + (c + m) + " " + d);
        } else if (b == d) {
            System.out.println(anti + " " + (b + l) + " " + c + " " + (d + l));
        } else if (l != m) {
            System.out.println(-1);
        } else {
            System.out.println(anti + " " + d + " " + c + " " + b);
        }

        scanner.close();
    }
}
```

This Java code reads four integer values, executing logic based on the absolute differences and the given conditions, and finally printing the output to the console.

Note: The Java code above assumes that you will be using the standard input in a similar way as provided in the test case, namely, entering four space-separated integers on a single line.
