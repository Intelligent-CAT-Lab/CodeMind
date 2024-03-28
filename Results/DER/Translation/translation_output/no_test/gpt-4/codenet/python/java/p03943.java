Here is the Python code translated to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        String ans = "No";
        if (a + b == c) {
            ans = "Yes";
        }
        if (a + c == b) {
            ans = "Yes";
        }
        if (b + c == a) {
            ans = "Yes";
        }

        System.out.println(ans);
    }
}
```

This Java code does the same operations as the Python code. It reads three integer values from the user (assuming they're separated by spaces), checks if any pair of them sums up to the third, and prints "Yes" if so, or "No" otherwise.
