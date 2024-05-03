Here is the Java version of your Python code:

```java
import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        int n = sc.nextInt();
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            int x = n / i;
            ans += (long) i * (1 + x) * x / 2;
        }
        System.out.println(ans);
    }

    static Scanner sc = new Scanner(System.in);
}
```

Please note that Java does not have a built-in function to read an integer from the standard input like Python's `input()`. Instead, we use a `Scanner` object to read the input. Also, Java uses `long` instead of `int` for large numbers, so we cast `i` to `long` when adding it to `ans`.
