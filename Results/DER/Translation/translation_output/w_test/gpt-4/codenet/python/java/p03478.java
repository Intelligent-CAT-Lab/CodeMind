Here is a java program that replicates the behavior of your python code:

```java
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = 0;
        for (int n_i = 1; n_i <= n; n_i++) {
            int n_orders_sum = sumOfDigits(n_i);
            if (a <= n_orders_sum && n_orders_sum <= b) {
                sum += n_i;
            }
        }
        System.out.println(sum);
        scanner.close();
    }

    // Helper method to calculate the sum of digits of a number
    private static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
```

This Java code accepts three integers (`n`, `a`, and `b`) from standard input, mimicking the behavior of the Python code that calculates the sum of numbers where the sum of their digits is between `a` and `b`, inclusive.
