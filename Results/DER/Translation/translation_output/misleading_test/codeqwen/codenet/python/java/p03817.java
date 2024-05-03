Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int ans = 0;
        int q = x / 11;
        ans += 2 * q;
        q = x % 11;
        ans += q / 6;
        if (q % 6 > 0) {
            ans += 1;
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, performs the same calculations as your Python code, and prints the result.
