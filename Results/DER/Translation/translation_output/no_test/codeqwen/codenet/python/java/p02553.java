Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        long ans = -1000000000000000000L;
        ans = Math.max(ans, (long) a * c, (long) a * d, (long) b * c, (long) b * d);
        System.out.println(ans);
    }
}
```

In Java, we use `Scanner` to read input from the user. The `nextInt()` method is used to read an integer from the user. The `Math.max()` function is used to find the maximum value among the given numbers. The `long` keyword is used to declare a variable that can hold a larger range of values than an `int`.
