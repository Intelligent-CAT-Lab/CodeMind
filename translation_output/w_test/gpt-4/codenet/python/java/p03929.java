Here's the Python code translated to Java:

```java
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();
        
        // Processing
        ArrayList<Integer> r = new ArrayList<>();
        for (int i = 1; i <= 11; i++) {
            int m = 0;
            for (int j = 1; j <= 5; j++) {
                int t = 0;
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        t += 7 * (i + y) + (j + x) - 7;
                    }
                }
                if (t % 11 == k) m += 1;
            }
            r.add(m);
        }

        int a = n / 11;
        int b = n % 11;
        int ans = 0;
        for (int count : r) ans += count;
        ans *= a;
        if (b < 1) ans -= r.get(9);
        if (b < 2) ans -= r.get(10);
        if (b >= 3) {
            for (int i = 0; i < b - 2; i++) ans += r.get(i);
        }

        // Output
        System.out.println(ans);
    }
}
```

Make sure to use this Java code with the built-in Scanner class to read input from standard input.

The Java code aims to perform the same calculations and logic as the Python code. It includes input handling with the Scanner class, similar processing through nested loops, and conditionals to achieve the same results as described in the Python code. The Python-specific structures and features such as list comprehensions and the `divmod` function have been translated into equivalent Java structures.
