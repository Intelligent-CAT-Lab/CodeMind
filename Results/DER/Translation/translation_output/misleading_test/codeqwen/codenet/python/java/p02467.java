Here is the Java version of the provided Python code:

```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        int n = Integer.parseInt(System.console().readLine());

        System.out.print(n + ": ");
        List<Integer> factors = primeFactorization(n);
        for (int i = 0; i < factors.size(); i++) {
            System.out.print(factors.get(i));
            if (i < factors.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static List<Integer> primeFactorization(int n) {
        List<Integer> res = new ArrayList<>();
        if (n < 2) {
            res.add(n);
            return res;
        }

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

This Java code does the same thing as the Python code: it reads an integer from the console, prints the prime factorization of the integer, and then prints the result. The `primeFactorization` method returns a list of the prime factors of the input integer.
