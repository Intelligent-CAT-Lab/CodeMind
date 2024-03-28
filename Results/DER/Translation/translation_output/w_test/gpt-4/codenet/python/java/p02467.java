Here's the equivalent Java program for the given Python code. It reads an integer from the standard input, calculates its prime factors, and prints them out alongside the number itself.

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactorization {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.print(n + ": ");
        List<Integer> factors = primeFactorization(n);
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        scanner.close();
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

Here's how the program works: The `main` method reads an integer `n` and then calls the `primeFactorization` method to get its prime factors. This method creates a list to store the factors and uses a for loop to find all factors between 2 and the square root of `n`, repeatedly dividing `n` by these factors when they are found. If there's any remainder factor greater than 1 after this process, it is also added to the list. Finally, the factors are printed out.

To run a test for the input '12', you would need to compile and run this Java code and enter '12' when prompted for input. The expected output would be "12: 2 2 3 " (note the extra whitespace at the end due to the way we're printing the factors in the loop).
