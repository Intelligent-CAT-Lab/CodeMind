Here's the translated Java code for the provided Python script:

```java
import java.util.Scanner;

public class ScoreCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int score = Math.abs(a - b);

        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= n; y++) {
                if ((b * x) % y == 0) {
                    int new_a = (b * x) / y;
                    score = Math.min(score, Math.abs(a - new_a));
                }
            }
        }

        System.out.println(score);
    }
}
```

To use this code, compile it and run it. Provide the test input when prompted. The expected output should match the provided expected result if the test case is similar to the one provided in the Python code example.
