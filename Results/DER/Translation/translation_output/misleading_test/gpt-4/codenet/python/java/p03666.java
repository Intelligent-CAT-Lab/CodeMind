Below is the Python code translated to Java. In Java, you would typically create a method, often within a class, to handle the logic, and use a Scanner to handle input. Here is the translated code, including a simple `main` method to execute the logic based on the test input provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        boolean found = false;
        for (int k = 0; k <= N; k++) {
            int j = N - 1 - k;
            if (D * k - C * j >= B - A && B - A >= C * k - D * j) {
                System.out.println("YES");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("NO");
        }

        scanner.close();
    }
}
```

Note that Java is more verbose than Python, which means more lines of code are required to do similar tasks. Additionally, the for-loop in Python that contains an `else` block (which executes when the loop completes without a `break`) is represented by a flag variable `found` in Java, since Java doesn't have a direct equivalent to the Python loop-`else` construct.
