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
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
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

This Java code does the same thing as your Python code. It reads the input from the user, calls the `solve` method, and prints the result. The `solve` method is the same as your Python code. It iterates over all possible pairs of `i` and `j` and checks if the condition is met. If it is, it prints "YES" and returns. If it doesn't find any pair that satisfies the condition, it prints "NO".
