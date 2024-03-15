Below is the translated Java code from the provided Python code:

```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.print(n + ": ");
        ArrayList<Integer> factors = primeFactorization(n);
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        scanner.close();
    }

    public static ArrayList<Integer> primeFactorization(int n) {
        if (n < 2) {
            ArrayList<Integer> res = new ArrayList<>();
            res.add(n);
            return res;
        }

        ArrayList<Integer> res = new ArrayList<>();
        int lim = (int) Math.sqrt(n);

        for (int p = 2; p <= lim; p++) {
            while (n % p == 0) {
                res.add(p);
                n /= p;
            }
        }

        if (n > 1) {
            res.add(n);
        }

        return res;
    }
}
```

Please note a few things while translating Python to Java:

- Java is statically typed, so we must declare the type of variables.
- Instead of Python's `print(*list)`, I used a for-each loop in Java to print each element followed by a space.
- The `sqrt` method is part of the `Math` class in Java.
- An `ArrayList` is used to store the prime factors because the size is not known beforehand.
- Scanner is used for console input instead of `input()`.
- The main method in Java serves as the entry point for the program, akin to `if __name__ == '__main__'` in Python.
- Always remember to close the Scanner to prevent resource leaks.
