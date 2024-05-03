Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ans = 100000;
        for (int i = 0; i < scanner.nextInt(); i++) {
            ans *= 1.05;
            if (ans % 1000 != 0) {
                ans += 1000 - ans % 1000;
            }
        }
        System.out.println((int) ans);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, multiplies it by 100000, and then multiplies it by 1.05 for each iteration of the loop. If the result is not a multiple of 1000, it adds 1000 to it. Finally, it prints the result as an integer.
