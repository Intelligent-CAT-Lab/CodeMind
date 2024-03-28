Here's the translated code in Java:

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
        scanner.close();
    }
}
```

This Java code snippet does roughly the same thing as the provided Python code. It reads two integers `a` and `b` from the standard input, then it calculates the sum of the maximum of `a` and `b` twice (decrementing the larger of the two each time), finally, it outputs the calculated sum `c`. Note that in Java, we need to import the `java.util.Scanner` class for reading input from the standard input.
