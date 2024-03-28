Here is the translated code from Python to Java:

```java
import java.util.Scanner;

public class ChangeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int c1 = scanner.nextInt();
        int c5 = scanner.nextInt();
        int c10 = scanner.nextInt();
        int c50 = scanner.nextInt();
        int c100 = scanner.nextInt();
        int c500 = scanner.nextInt();

        int sum = c1 + c5 * 5 + c10 * 10 + c50 * 50 + c100 * 100 + c500 * 500;

        System.out.println(sum >= 1000 ? 1 : 0);

        scanner.close();
    }
}
```

To test this in a Java environment, you can compile and run this code, then input `3 1 4 0 4 1` when prompted. The expected output would be `0`.
