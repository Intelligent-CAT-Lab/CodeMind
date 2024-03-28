Here's the Python code translated to Java:

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        for (int i = 1; i < Math.pow(10, 5); i++) {
            if (360 * i % x == 0) {
                System.out.println(360 * i / x);
                break;
            }
        }

        scanner.close();
    }
}
```

To run a test case, you can compile and execute this Java class and provide the test input as specified. In this case, input `90` and it should output `66` as expected.
