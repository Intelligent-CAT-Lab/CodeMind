Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        while (A > 0 && C > 0) {
            C -= B;
            if (C <= 0) {
                System.out.println("Yes");
                break;
            }
            A -= D;
            if (A <= 0) {
                System.out.println("No");
                break;
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the user, and then enters a loop that subtracts B from C and A from D until either C or A becomes zero. If C becomes zero, it prints "Yes" and breaks out of the loop. If A becomes zero, it prints "No" and breaks out of the loop. If neither C nor A becomes zero, it continues the loop.
