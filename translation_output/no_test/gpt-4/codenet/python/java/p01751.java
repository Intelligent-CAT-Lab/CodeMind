Here's the equivalent Java code for the given Python snippet:

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        int t = 0;
        boolean found = false;

        for (int loop = 0; loop < 61; loop++) {
            if (t % 60 <= c && c <= t % 60 + a) {
                System.out.println(t / 60 * 60 + c);
                found = true;
                break;
            }
            t += a + b;
        }

        if (!found) {
            System.out.println(-1);
        }
    }
}
```

Make sure to compile and run the Java code to verify its correctness, as translating from one language to another can sometimes introduce issues that were not present in the original code.
