Below is the translated Java code for the provided Python snippet. It reads from standard input, so make sure to provide input in the format specified in the test case:

Test input: `3 1 20 15 17 5`

Expected output: `NGO`

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

    private static void solve(int d, int t, int a, int b, int da, int db) {
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

To use this Java code, compile it with a Java compiler, and then run the resulting class file in your Java runtime environment, providing the appropriate input.
