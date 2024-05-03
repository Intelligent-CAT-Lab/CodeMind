Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mask = (int)Math.pow(2, 32) - 1;
        System.out.println(String.format("%032b", n));
        System.out.println(String.format("%032b", ~n & mask));
        System.out.println(String.format("%032b", (n << 1) & mask));
        System.out.println(String.format("%032b", (n >>> 1) & mask));
    }
}
```

In this Java code, we use the `Scanner` class to read the input from the user. The `Math.pow(2, 32) - 1` expression is used to create a mask that has all bits set to 1. The `String.format("%032b", n)` expression is used to print the binary representation of the number `n` with leading zeros. The `~n & mask` expression is used to compute the bitwise NOT of `n` and then apply the mask to it. The `(n << 1) & mask` expression is used to compute the bitwise left shift of `n` by 1 and then apply the mask to it. The `(n >>> 1) & mask` expression is used to compute the bitwise right shift of `n` by 1 and then apply the mask to it.
