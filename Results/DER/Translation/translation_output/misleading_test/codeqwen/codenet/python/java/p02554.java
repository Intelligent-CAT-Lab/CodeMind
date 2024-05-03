Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ant = 1, bnt = 1, cnt = 1;

        for (int i = 0; i < n; i++) {
            ant = (10 * ant) % 1000000007;
            bnt = (9 * bnt) % 1000000007;
            cnt = (8 * cnt) % 1000000007;
        }

        int ans = (ant - (2 * bnt - cnt)) % 1000000007;

        if (ans >= 0) {
            System.out.println(ans);
        } else {
            System.out.println(1000000007 + ans);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, performs the same calculations as the Python code, and prints the result.
