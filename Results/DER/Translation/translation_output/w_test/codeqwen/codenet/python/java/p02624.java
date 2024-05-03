Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class DSumOfDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sum(n));
    }

    public static int sum(int n) {
        return (int) (sum(n, 1) - 1);
    }

    public static double sum(int n, int k) {
        if (k > n) {
            return 0;
        }
        return k + sum(n, k + 1) + (n / k) * (k + 1);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the standard input, calculates the sum of the divisors of the number, and prints the result. The `sum` method is a recursive function that calculates the sum of the divisors of the number. The base case of the recursion is when `k` is greater than `n`, in which case the function returns 0. Otherwise, the function returns `k` plus the sum of the divisors of `n` with `k` incremented by 1, plus `n / k` times `k + 1`. The `sum` method is called with `n` and 1 as arguments to start the recursion. The result of the recursion is then subtracted by 1 to get the final sum of the divisors of `n`.
