Here is the Java version of your Python code:

```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(primeFactorization(12));
    }

    public static String primeFactorization(int n) {
        if (n < 2) {
            return String.valueOf(n);
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

        return res.toString();
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the standard input, performs the prime factorization, and prints the result. The prime factorization is done by dividing the number by each integer from 2 up to the square root of the number. If the number is divisible by the integer, it is added to the result list and the number is divided by the integer. This process continues until the number is no longer divisible by the integer. If the number is greater than 1 after this process, it is also added to the result list. The result list is then converted to a string and returned.
