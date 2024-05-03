Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int k = n / (a + b);
        int p = n % (a + b);

        System.out.println(k * a + Math.min(p, a));
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, calculates the values of `k` and `p`, and then prints the result. The `Math.min` function is used to find the minimum of `p` and `a`.
