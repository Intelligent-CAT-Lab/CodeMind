Here's the equivalent Java code for the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int ans = 0;
        int q = x / 11;
        int r = x % 11;
        ans += 2 * q;
        q = r / 6;
        r = r % 6;
        ans += q;
        if (r > 0) {
            ans += 1;
        }
        System.out.println(ans);
        scanner.close();
    }
}
```

The above Java code performs the input and computation in a similar way to the Python code. It uses `Scanner` for input, integer division and modulo for the division and remainder operation (`divmod` in Python), and `System.out.println` for output.
