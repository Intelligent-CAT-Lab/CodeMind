Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 1;
        while (Math.log(n) / Math.log(2) % 1 != 0) {
            x += 1;
            n -= (int) Math.pow(2, (int) Math.log(n) / Math.log(2));
        }
        System.out.println(x);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, then enters a loop that continues until the logarithm base 2 of `n` is an integer. In each iteration of the loop, it subtracts `2^(log2(n))` from `n` and increments `x`. Finally, it prints the value of `x`.
