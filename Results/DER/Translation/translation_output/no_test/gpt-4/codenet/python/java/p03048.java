Here's the equivalent Java code for the given Python code:

```java
import java.util.Scanner;

public class ColorCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        int G = scanner.nextInt();
        int B = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();

        int cnt = 0;
        for (int r = 0; r <= n / R; r++) {
            for (int g = 0; g <= (n - r * R) / G; g++) {
                int b = (n - r * R - g * G) / B;
                if (r * R + g * G + b * B == n) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
```

In this Java code snippet, I first import the `Scanner` class for input, then define a class `ColorCombinations` with the `main` method that uses the `Scanner` to read the integers (R, G, B, n). The code then proceeds to calculate the number of combinations, similar to the Python code, and prints the result. Note that Java requires explicit type declarations and does not support tuple assignment as in Python, so each integer is read and assigned separately. The `Scanner` is closed after use to avoid resource leaks.
