Sure, here's how you could write the equivalent code in Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if (A + B < C) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
        
        scanner.close();
    }
}
```

In this Java code, we achieve the same functionality as the Python code. We first import the `Scanner` class to read input from the standard input stream. Then we read three integers (`A`, `B`, and `C`) from the input, compare the sum of `A` and `B` with `C`, and print out the result accordingly. Finally, we close the scanner to prevent resource leaks.
