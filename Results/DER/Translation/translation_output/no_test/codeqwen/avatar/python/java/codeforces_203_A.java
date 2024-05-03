Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int t = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int da = scanner.nextInt();
        int db = scanner.nextInt();

        solve(d, t, a, b, da, db);
    }

    public static void solve(int d, int t, int a, int b, int da, int db) {
        for (int i = 0; i <= t; i++) {
            for (int j = 0; j <= t; j++) {
                if (a - da * i + b - db * j == d || a - da * i == d || b - db * j == d || d == 0) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}
```

This Java code does the same thing as your Python code. It reads four integers from the standard input, and then calls the `solve` method with these integers. The `solve` method checks all possible pairs of integers `i` and `j` from 0 to `t`, and if any of them satisfy the condition `a - da * i + b - db * j == d || a - da * i == d || b - db * j == d || d == 0`, it prints "YES" and returns. If no such pair is found, it prints "NO".
