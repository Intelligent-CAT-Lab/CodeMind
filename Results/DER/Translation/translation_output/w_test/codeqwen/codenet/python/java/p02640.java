Here is the Java version of your Python code:

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

This Java code does the same thing as your Python code. It reads two integers from the user, then it iterates over all possible values of `a` from 0 to `x`. For each `a`, it calculates `b` and checks if `2*a + 4*b` equals `y`. If it does, it sets `count` to 1 and breaks out of the loop. After the loop, it prints "Yes" if `count` is 1, otherwise it prints "No".
