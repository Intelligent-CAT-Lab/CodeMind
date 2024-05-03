Here is the Java version of your Python code:

```java
import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(ij(n));
    }

    public static int ij(int x) {
        for (int i = x; i > 0; i--) {
            if (n / i == n / (double) i) {
                return i + n / i;
            }
        }
        return 0;
    }
}
```

Please note that in Java, the `/` operator performs integer division, so we need to cast `n` to a double to get the correct floating point division. Also, the `ij` function returns the sum of `i` and `n/i`, not `i` and `n//i` as in your Python code.
