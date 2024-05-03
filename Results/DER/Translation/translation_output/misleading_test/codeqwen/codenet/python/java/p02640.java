Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int count = 0;
        for (int a = 0; a <= x; a++) {
            int b = x - a;
            if (2 * a + 4 * b == y) {
                count = 1;
                break;
            } else {
                continue;
            }
        }
        if (count == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, calculates the possible values of `a` and `b` for the given `x` and `y`, and checks if the sum of `2*a + 4*b` equals `y`. If it does, it sets `count` to 1 and breaks out of the loop. If it doesn't find any such `a` and `b`, it prints "No".
