Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();

        if (h % 3 == 0 || w % 3 == 0) {
            System.out.println(0);
            return;
        }

        int res = Math.min(h, w);
        for (int hi = 1; hi < h; hi++) {
            int b1 = hi * w;
            int b2 = (h - hi) * (w / 2);
            int b3 = (h - hi) * (w / 2 + w % 2);
            res = Math.min(res, Math.max(b1, b2, b3) - Math.min(b1, b2, b3));
        }
        for (int wi = 1; wi < w; wi++) {
            int b1 = wi * h;
            int b2 = (w - wi) * (h / 2);
            int b3 = (w - wi) * (h / 2 + h % 2);
            res = Math.min(res, Math.max(b1, b2, b3) - Math.min(b1, b2, b3));
        }

        System.out.println(res);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, checks if they are divisible by 3, and if so, prints 0 and exits. If not, it calculates the minimum of the height and width, and then iterates over all possible values of hi and wi, calculating the maximum and minimum values of b1, b2, and b3, and updating the result with the minimum of the current result and the difference between the maximum and minimum values. Finally, it prints the result.
