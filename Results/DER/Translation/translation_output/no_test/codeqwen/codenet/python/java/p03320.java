Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int a = 0;
        int d = 1;

        for (int i = 1; i <= K; i++) {
            int x = a + d;
            int y = a + 10 * d;
            if ((double) x / snuke(x) <= (double) y / snuke(y)) {
                a = x;
            } else {
                a = y;
                d *= 10;
            }
            System.out.println(a);
        }
    }

    public static int snuke(int x) {
        int a = 0;
        while (x > 0) {
            a += x % 10;
            x /= 10;
        }
        return a;
    }
}
```

This Java code does the same thing as your Python code. It reads an integer `K` from the user, then it calculates `a` and `d` and prints `a` in a loop. The `snuke` function is the same as your Python function.
