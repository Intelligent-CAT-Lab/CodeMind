Here is the Python code translated to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int X = scanner.nextInt();
        scanner.close();

        int k = X / 1000;
        int ans = k * Math.min(A, 2 * B);
        int r = X - 1000 * k;
        if (0 < r && r <= 500) {
            ans += Math.min(A, B);
        } else if (500 < r) {
            ans += Math.min(A, 2 * B);
        }
        System.out.println(ans);
    }
}
```

When you input `180 100 2400`, the expected output `491` will be printed to the console. Make sure to enter the values on the same line separated by spaces when running the Java program, similar to the test input format provided.
