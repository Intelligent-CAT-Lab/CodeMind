Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int y = 100;
        int ans = 0;
        while (y < x) {
            ans += 1;
            y = (int) Math.floor(y * 1.01);
        }

        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, then enters a loop that continues until `y` is greater than or equal to `x`. In each iteration of the loop, it increments `ans` by 1 and multiplies `y` by 1.01, then rounds down to the nearest integer using `Math.floor()`. Finally, it prints out the value of `ans`.
