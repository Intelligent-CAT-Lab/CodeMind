Here's the equivalent Java code for the given Python program:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactorization {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        List<Integer> factors = primeFactorization(n);

        System.out.print(n + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
    }

    private static List<Integer> primeFactorization(int n) {
        if (n < 2) {
            List<Integer> singleElementList = new ArrayList<>();
            singleElementList.add(n);
            return singleElementList;
        }

        List<Integer> res = new ArrayList<>();
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

To test this Java program with the test input provided (12), compile and run the program, then input "12" when prompted. You should see the output "12: 2 3 ".
