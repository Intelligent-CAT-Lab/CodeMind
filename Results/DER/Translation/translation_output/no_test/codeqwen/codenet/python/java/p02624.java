Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class DSumOfDivisors {
    public void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println((int) (sum(k/2.0 * (n/k) * (1 + n/k) for k in range(1, n + 1))));
    }

    public static double sum(double... values) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum;
    }

    public static void main(String[] args) {
        DSumOfDivisors solver = new DSumOfDivisors();
        solver.solve();
    }
}
```

Please note that the Python code you provided is not a valid Python program. It seems to be a part of a larger program, but it is not complete. The code you provided is missing the `divCount` function, which is used to calculate the number of divisors of a number.

In the Java version, I have created a `DSumOfDivisors` class with a `solve` method that reads an integer from the standard input and prints the result of the calculation. The `sum` method is a helper method that calculates the sum of the given values.

The `main` method creates an instance of the `DSumOfDivisors` class and calls the `solve` method.
