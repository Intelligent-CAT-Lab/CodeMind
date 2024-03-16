Here's the Python code translated to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        
        double c = (a + b) / 2.0;
        int d = (int) c;
        
        if (c - d > 0) {
            System.out.println(d + 1);
        } else {
            System.out.println(d);
        }
    }
}
```

In this Java code, I'm using `Scanner` to read the two integers from the standard input, mirroring the `input().split()` functionality in Python. The calculation of `c` and `d` is similar to the original Python code, with the explicit conversion of the average to an integer for `d`. The comparison and printing logic is unchanged, but using Java's syntax and print methods.
