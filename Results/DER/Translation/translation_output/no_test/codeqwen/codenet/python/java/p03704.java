Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String D = scanner.nextLine();
        int sum = 0;
        for (int i = 1; i < 21; i++) {
            sum += f(D, i, 0) * (10 - i % 2 * 9);
        }
        System.out.println(sum);
    }

    public static int f(String d, int x, int y) {
        int n = Integer.parseInt("9".repeat(x) + "0".repeat(y));
        return x < 1 ? 1 : sum(f(d, x - 2, y + 1) * (10 - Math.abs(i) - (y < 1)), 10 - abs(i) - (y < 1));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int abs(int i) {
        return Math.abs(i);
    }
}
```

Please note that the `sum` function is not needed in Java, as Java already has a built-in `+` operator for integers. Also, Java does not have a built-in `repeat` function for strings, so I used a loop to create the string. The `abs` function is also not needed in Java, as Java already has a built-in `Math.abs` function.
