```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        String ans = "No";

        for (int i = 0; i <= n / 2; i++) {
            for (int j = 0; j < m; j++) {
                int o = i * j + (m - j) * (n - i);
                int x = n * m - o;
                if (o == k || x == k) {
                    ans = "Yes";
                }
            }
        }

        System.out.println(ans);
        scanner.close();
    }
}
```

This Java code reads three integers `n`, `m`, and `k` from standard input, similar to how the Python code uses `input().split()` to get user input and then `map(int, ...)` to convert it to integers. It then declares a variable `ans` as `"No"` and uses two nested `for` loops to iterate over the possible values, performs an operation with them, and checks if `o` or `x` equals `k`. If so, it updates the `ans` variable to `"Yes"`. Finally, the code prints the value of `ans`.
