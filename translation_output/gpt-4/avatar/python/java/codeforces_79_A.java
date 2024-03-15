Here's how the provided Python code can be translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        boolean cielWon = false;

        while (y > 1 && x * 10 + y > 21) {
            int t = Math.min(x, 2);
            x -= t;
            y -= (2 - t) * 10 + 2;
            if (y < 2 || 10 * x + y < 22) {
                cielWon = true;
                break;
            }
            y -= 2;
            t = Math.min(2, y / 10);
            y -= 10 * t;
            x -= 2 - t;
        }

        System.out.println(cielWon ? "Ciel" : "Hanako");
        scanner.close();
    }
}
```

This Java code performs the same logic as the Python code. It reads two integers as input for `x` and `y`, then applies the same logic as in the Python code to determine the outcome of the game, and finally prints either "Ciel" or "Hanako" based on the value of `cielWon`. Note that in Java, integer division behaves similarly to using `//` in Python, so you will get an integer result when dividing two integers. Also, in Java `Scanner` class is commonly used for input, and `Math.min` is the equivalent of Python's `min` function. Don't forget to close the `Scanner` to avoid resource leaks.
