Here's the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();
        scanner.close();

        int d = a - b;
        int n = Math.max(0, (x - b) / d);
        long ans = ((long)x + (long)n * b) % 1000000007;

        System.out.println(ans);
    }
}
```

In the provided Java code, I'm using a `Scanner` to read the three integers from standard input (which corresponds to the `input().split()` part in the Python code). I've casted `x` and `n * b` to `long` to prevent integer overflow when performing the addition before the modulo operation, which is necessary since the result could exceed the range of `int` in Java. Java's integer division acts like the floor division (`//`) in Python when dealing with positive numbers, so the division behaves the same. 

Remember that Java has a strong type system, so you have to define the type of each variable, unlike Python, which is dynamically typed.
