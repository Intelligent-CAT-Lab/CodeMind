Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int count = 0;
        for (int a = 0; a <= x; a++) {
            int b = x - a;
            if (2 * a + 4 * b == y) {
                count = 1;
                break;
            }
        }
        System.out.println(count == 1 ? "Yes" : "No");
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, then iterates over all possible values of `a` from 0 to `x`. For each `a`, it calculates `b` and checks if `2*a + 4*b` equals `y`. If it does, it sets `count` to 1 and breaks out of the loop. If it doesn't find such a pair of `a` and `b`, it prints "No".
