Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int h = Integer.parseInt(input[0]);
        int a = Integer.parseInt(input[1]);
        int b = Integer.parseInt(input[2]);

        int count = 0;
        for (int c = b - a + 1; c >= 0; c--) {
            if (h % (a + c) == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, then iterates over a range of integers from `b - a + 1` to 0, checking if `h` is divisible by `a + c` for each `c`. If it is, it increments a counter. Finally, it prints the count.
