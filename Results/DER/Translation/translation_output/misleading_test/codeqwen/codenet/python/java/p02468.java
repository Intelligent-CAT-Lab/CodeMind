Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int mod = (int) Math.pow(10, 9) + 7;
        System.out.println(pow(m, n, mod));
    }

    public static int pow(int m, int n, int mod) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            return pow(m * m % mod, n / 2, mod);
        } else {
            return m * pow(m * m % mod, (n - 1) / 2, mod) % mod;
        }
    }
}
```

This Java program reads two integers from the user, calculates the power of the first integer to the second integer, and then prints the result modulo 10^9+7. The `pow` method is a recursive function that calculates the power of a number using the exponentiation by squaring algorithm, which is more efficient than the naive approach of multiplying the number by itself n times.
