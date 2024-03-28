Certainly! Below is the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class IncrementalAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a = 0;

        for (int i = 0; i < n - 1; i++) {
            a += a / (k - 1) + 1;
        }

        System.out.println(a);

        sc.close();
    }
}
```

This Java program reads two integers `n` and `k` from standard input (just like the `input().split()` in Python), and then performs the arithmetic operations and prints out the result.

Here's how the code works in relation to the Python version:

- Uses `Scanner` to handle input.
- Declares variables `n`, `k`, and `a`.
- Executes the loop for `n - 1` iterations.
- Inside the loop, increments `a` just as the Python code does: `a += a / (k - 1) + 1`.
- Prints out the final value of `a`.

Please note that the example assumes you provide space-separated integers as input just like in the test input provided.
