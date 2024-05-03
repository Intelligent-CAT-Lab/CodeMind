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
        return (int) (sum(n, 2) - 1);
    }

    public static double sum(int n, int k) {
        if (k > n) {
            return 0;
        }
        return k + sum(n, k + 1) + (n / k) * (k + 1);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the standard input, calculates the sum of the divisors of the number, and prints the result. The `sum` method is a recursive function that calculates the sum of the divisors of a number. It uses the formula `k + sum(n, k + 1) + (n / k) * (k + 1)` to calculate the sum of the divisors of a number. The `sum` method is called with the initial value of `k` as 2. The `main` method reads an integer from the standard input, calls the `sum` method with the input number, and prints the result.
