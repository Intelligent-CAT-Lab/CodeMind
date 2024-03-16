Here's the translation of the provided Python code into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long l = scanner.nextLong();
        long r = scanner.nextLong();
        scanner.close();

        long curr = r;
        int s = 0;
        while (curr > 0) {
            s++;
            curr /= 10;
        }
        long first = (long) Math.pow(10, s);
        long second = first / 2;
        long ans = -1;
        long[] candidates = {l, r, first, second};

        for (long i : candidates) {
            if (i >= l && i <= r) {
                curr = i;
                StringBuilder rev = new StringBuilder();
                while(curr > 0) {
                    rev.append(9 - (curr % 10));
                    curr /= 10;
                }
                long revNum = Long.parseLong(rev.toString());
                ans = Math.max(ans, revNum * i);
            }
        }
        System.out.println(ans);
    }
}
``` 

A few notes on the translation process:

- Java uses static typing, so we have to declare the type of each variable explicitly using `long` for `l`, `r`, `curr`, `first`, `second`, and `ans`, to accommodate large numbers.

- Java does not have a direct equivalent to Python's `input().split()`, so we used `Scanner` to read the input.

- Instead of Python's `print`, Java uses `System.out.println` to output to the console.

- In Python, string multiplication is used to repeat a character. In Java, we have to manually create that repetition inside a loop.

- The `max` function is part of the `Math` class in Java.

- Java arrays do not require pre-declaring the size in this case, as we are initializing it immediately with known values.

- We have to use `StringBuilder` for an efficient way to build the reverse of the number string.

The provided Java code should behave the same way as the Python code when given the same input.
