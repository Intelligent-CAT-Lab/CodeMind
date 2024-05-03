Here is the Java version of the provided Python code:

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

        for (int k = 0; k <= N; k++) {
            int j = N - 1 - k;
            if (D * k - C * j >= B - A && C * k - D * j >= B - A) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
```

This Java code does the same thing as the Python code. It reads five integers from the user, and then it iterates from 0 to N. For each iteration, it calculates j and checks if the condition is met. If it is, it prints "YES" and breaks the loop. If it doesn't find a match after iterating through all possible values of k, it prints "NO".
