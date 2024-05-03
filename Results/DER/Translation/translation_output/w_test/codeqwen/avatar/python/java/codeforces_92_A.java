Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int i = 0;
        while (true) {
            if (i + 1 > m) {
                int ans = m;
                break;
            }
            m -= i + 1;
            i += 1;
            i %= n;
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the standard input, performs the same operations as your Python code, and prints the result.
