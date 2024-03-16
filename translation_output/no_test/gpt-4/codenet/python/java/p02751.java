Here's the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

        String[][] ans = new String[(1 << n) - 1][(1 << m) - 1];
        for (int i = 0; i < (1 << n) - 1; i++) {
            for (int j = 0; j < (1 << m) - 1; j++) {
                ans[i][j] = "1";
            }
        }

        for (int k = 1; k < 11; k++) {
            for (int i = (1 << k); i < (1 << n); i += (1 << k)) {
                for (int j = (1 << k); j < (1 << m); j += (1 << k)) {
                    if (ans[i - 1][j - 1].equals("1")) {
                        ans[i - 1][j - 1] = "0";
                    } else {
                        ans[i - 1][j - 1] = "1";
                    }
                }
            }
        }
        
        for (int i = 0; i < (1 << n) - 1; i++) {
            for (int j = 0; j < (1 << m) - 1; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}
```

This code does the following:
1. Reads two integers `n` and `m`.
2. Initializes a 2D array `ans` of size `(2^n - 1) x (2^m - 1)` with all elements set to "1".
3. Iterates through the `ans` array for `k` from 1 to 10, toggling elements at specific intervals from "1" to "0" or from "0" to "1" based on the given conditions.
4. Finally, prints out the `ans` array line by line.

Notice that since Java is statically typed, we need to define the types of our variables explicitly. Additionally, Java does not have a direct equivalent to Python's list comprehensions, so we need to use nested loops to initialize and manipulate our 2D array.
