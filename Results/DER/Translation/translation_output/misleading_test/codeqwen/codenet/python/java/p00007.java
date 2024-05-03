Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double ans = 100000;
        for (int i = 0; i < n; i++) {
            ans *= 1.05;
            if (ans % 1000 != 0) {
                ans += 1000 - ans % 1000;
            }
        }
        System.out.println((int) ans);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, multiplies it by 1.05 in a loop, and if the result is not a multiple of 1000, it adds 1000 to it. Finally, it prints the result as an integer.
