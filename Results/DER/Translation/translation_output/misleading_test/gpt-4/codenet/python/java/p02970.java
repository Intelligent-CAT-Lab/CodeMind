Below is the Java translation of the provided Python code and a sample method to test it:

```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        solve();
    }
    
    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println((n + (2 * d)) / (2 * d + 1));
        scanner.close();
    }
}
```

Please note that the Java version might behave slightly differently with regards to input handling, as System.in is not closed in Python's `input()` but the Scanner is closed in the Java version after reading input. This is not an issue for a simple program like this, but it would be relevant if you intended to read further input later in the program.

Also, in the Python version, the expression `-(-n // (2 * d + 1))` is used to achieve ceiling division. In Java, this effect is accomplished here with `(n + (2 * d)) / (2 * d + 1)` since integer division in Java truncates towards zero. The additional `(2 * d)` is used to ensure that if there is a remainder, it gets pushed to the next integer value, simulating the ceiling effect. Ensure that the addition does not cause an overflow if `n` and `d` are very large. If that's a possibility, you'll need to use a long or a BigInteger.
