```java
import java.util.Scanner;
import java.util.ArrayList;

public class PrimeFactorization {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.print(n + ": ");
        for (int factor : primeFactorization(n)) {
            System.out.print(factor + " ");
        }
    }

    public static ArrayList<Integer> primeFactorization(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        if (n < 2) {
            res.add(n);
            return res;
        }

        int lim = (int)Math.sqrt(n);

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
