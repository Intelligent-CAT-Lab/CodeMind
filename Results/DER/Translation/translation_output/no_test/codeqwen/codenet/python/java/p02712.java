Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 5 != 0 && i % 3 != 0) {
                ans += i;
            }
        }

        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, then iterates over all integers from 1 to N (inclusive), and adds each integer to the variable `ans` if it is not divisible by 5 or 3. Finally, it prints the value of `ans`.
