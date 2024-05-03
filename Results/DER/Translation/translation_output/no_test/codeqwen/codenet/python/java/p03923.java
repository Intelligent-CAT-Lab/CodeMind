Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().trim().split(" ");
        int n = Integer.parseInt(input[0]);
        int a = Integer.parseInt(input[1]);

        int t = n;
        for (int k = 1; Math.pow(Math.ceil(Math.pow(n, 1.0 / k)), k) <= n; k++) {
            int d = (int) Math.ceil(Math.pow(n, 1.0 / k));
            int l = 0;
            int r = k;
            while (l + 1 < r) {
                int c = (l + r) / 2;
                if (n <= (int) Math.pow(d - 1, k - c) * Math.pow(d, c)) {
                    r = c;
                } else {
                    l = c;
                }
            }
            t = Math.min(t, (d - 1) * (k - r) + d * r + (k - 1) * a);
        }
        System.out.println(t);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the standard input, calculates the minimum value of `t` and prints it.
