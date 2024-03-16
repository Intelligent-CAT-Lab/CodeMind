Here is the translation of your Python code to Java:

```java
import java.util.Scanner;

public class ThreeDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = 0, P = 0;
        for (int i = 0; i < 10; i++) {
            P = i * 111;
            if (X < N && N <= P) {
                System.out.println(P);
                break;
            }
            X = P;
        }
        scanner.close();
    }
}
```

You can run this Java class, provide an input (like `111` in your test case), and it should produce the expected output, which is `111`.
