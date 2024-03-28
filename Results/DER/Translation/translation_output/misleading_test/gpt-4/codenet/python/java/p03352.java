Here's the equivalent Java code for the Python program you've provided:

```java
import java.util.Scanner;

public class PowerMaximizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int ans = 1;

        for (int b = 1; b < x; ++b) {
            for (int p = 2; ; ++p) {
                double result = Math.pow(b, p);
                if (result <= x) {
                    ans = Math.max(ans, (int)result);
                } else {
                    break;
                }
            }
        }

        System.out.println(ans);
        scanner.close();
    }
}
```

You would run this Java program and provide the test input `10` when prompted, and the program will output the expected result `19`.
