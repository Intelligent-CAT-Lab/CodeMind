Here's the equivalent Java code for the given Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = scanner.nextInt();
        int turn = 0;

        for (int i = 0; i < k; i++) {
            if (turn == 0) {
                if (a % 2 == 0) {
                    b += a / 2;
                    a -= a / 2;
                } else {
                    a -= 1;
                    b += a / 2;
                    a -= a / 2;
                }
                turn = 1;
            } else {
                if (b % 2 == 0) {
                    a += b / 2;
                    b -= b / 2;
                } else {
                    b -= 1;
                    a += b / 2;
                    b -= b / 2;
                }
                turn = 0;
            }
        }

        System.out.println(a + " " + b);
        scanner.close();
    }
}
```

Pay attention that in the Python code, `input().split()` includes splitting the input by spaces and then `map(int, ...)` converts each part into an integer. Java's `Scanner` class handles these aspects separately by calling `nextInt()` for each integer input.

Additionally, Java is a statically typed language, so we have to declare the type of each variable before using it, unlike Python, which is a dynamically typed language.
