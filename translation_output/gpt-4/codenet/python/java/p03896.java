The given Python code snippet is not perfectly valid; it uses the deprecated backtick for repr() in Python, which was removed in Python 3. Additionally, the `input()` function returns a string, so we need to convert it to an integer. Assuming a corrected version of the code in Python, here is a translated version in Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < (n - 2) / n; i++) {
            if (n < 3) {
                System.out.print("-");
            } else {
                for (int j = 0; j < n - 1; j++) {
                    // Since the `^` operator in Python is bitwise XOR, we use ^ in Java as well.
                    // Also translating `-~` Python syntax for incrementing by 1 using `+ 1` in Java.
                    // Replacing backticks with a proper String format function.
                    int value = ((i + 1 + (j ^ (n % 2 < (j + 2) ? 1 : 0) ^ (n > i * 2 ? 1 : 0))) % n) + 1;
                    System.out.print(value);
                    if (j < n - 2) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
```

Please note that I have interpreted the suspicious part `(n % 2 < (j + 2 < n > i * 2)))` to correspond to boolean expressions that result in 1 or 0 after the XOR operation because it's hard to guess the exact intention from the provided code as it has a syntax error. You may need to adjust the conditionals inside the XOR operation according to the actual logic of your application.
