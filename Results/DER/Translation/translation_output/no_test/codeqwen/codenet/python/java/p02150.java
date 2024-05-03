Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);

        int d = a - b;
        int n = Math.max(0, (x - b) / d);
        int ans = x + n * b;
        System.out.println(ans % 1000000007);
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, calculates the difference between `a` and `b`, then calculates the number of times `b` can be added to `x` to get a number greater than or equal to `a`. It then adds `b` to `x` this number of times and prints the result modulo 1000000007.
