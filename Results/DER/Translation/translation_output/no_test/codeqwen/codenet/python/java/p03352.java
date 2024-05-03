Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int ans = 1;
        for (int b = 1; b <= x; b++) {
            for (int p = 2; p <= x; p++) {
                if (Math.pow(b, p) <= x) {
                    ans = Math.max(ans, (int) Math.pow(b, p));
                } else {
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
```

Please note that in Java, we use `Math.pow` to calculate the power of a number, and we need to cast the result to an `int` if we want to store it in an `int` variable. Also, in Java, the range of `int` is from `-2,147,483,648` to `2,147,483,647`, so if the result of `Math.pow(b, p)` is larger than `2,147,483,647`, it will cause an overflow. Therefore, we need to cast the result to an `int` before comparing it with `x`.
