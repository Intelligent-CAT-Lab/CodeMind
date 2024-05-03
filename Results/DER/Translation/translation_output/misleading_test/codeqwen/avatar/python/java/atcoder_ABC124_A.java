Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;
        for (int i = 0; i < 2; i++) {
            c += Math.max(a, b);
            if (a >= b) {
                a -= 1;
            } else {
                b -= 1;
            }
        }
        System.out.println(c);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, then it performs the same operations as your Python code. The `Math.max` function is used to find the maximum of two numbers, and the `-=` operator is used to subtract 1 from a number. The `System.out.println` function is used to print the result.
