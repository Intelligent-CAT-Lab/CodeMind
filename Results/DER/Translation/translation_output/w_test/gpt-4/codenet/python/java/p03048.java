Here's the Python code translated to Java:

```java
import java.util.Scanner;

public class ColorCombos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");

        int R = Integer.parseInt(inputs[0]);
        int G = Integer.parseInt(inputs[1]);
        int B = Integer.parseInt(inputs[2]);
        int n = Integer.parseInt(inputs[3]);

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

        scanner.close();
    }
}
```

You can compile and run this Java program with the same input "1 2 3 4" to get the expected output, which is "4". The Java code reads coefficients R, G, B, and n from the standard input, then uses nested loops to count the number of ways you can achieve the sum n with the multiples of R, G, and B.
