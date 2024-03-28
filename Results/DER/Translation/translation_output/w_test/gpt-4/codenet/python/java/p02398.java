Below is the Java translation for the given Python code:

```java
import java.util.Scanner;

public class DivisorCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int ans = 0;

        for (int i = a; i <= b; i++) {
            if (c % i == 0) {
                ans++;
            }
        }

        System.out.println(ans);
        scanner.close();
    }
}
```

This Java program performs the same operation as the Python code. It reads three integers `a`, `b`, and `c`, then counts how many numbers between `a` and `b` (inclusive) evenly divide `c` and prints the count (`ans`).
