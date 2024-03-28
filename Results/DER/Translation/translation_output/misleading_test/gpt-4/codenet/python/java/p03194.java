Here's the Python code translated to Java:

```java
import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        scanner.close();

        if (n == 1) {
            System.out.println(p);
        } else if (p == 1) {
            System.out.println(1);
        } else if (n >= 40) {
            System.out.println(1);
        } else {
            int ans = 1;
            int count = 2;
            long tmp = (long) Math.pow(count, n);
            while (tmp <= p) {
                if (p % tmp == 0) {
                    ans *= count;
                    p /= tmp;
                    count -= 1;
                }
                count += 1;
                tmp = (long) Math.pow(count, n);
            }
            System.out.println(ans);
        }
    }
}
```

The Java code performs the same logic as the Python code: it reads two integers `n` and `p`, and then applies the same calculations and checks. Please note, we must cast the exponentiation result to `long` to ensure the big numbers are handled correctly (`Math.pow` returns a `double`, which can cause precision issues when used as an integer).

To execute it, please make sure you have a Java environment set up, put this code into a file (e.g., `Solution.java`), compile with `javac Solution.java`, and then run with `java Solution`. In the execution process, you will need to enter the test input as specified in the problem statement.
