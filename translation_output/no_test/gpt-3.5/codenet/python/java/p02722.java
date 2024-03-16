```java
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrimeFactors {

    public static void check(long tot, long i, Set<Long> setl) {
        while (tot % i == 0) {
            tot /= i;
        }
        if (tot % i == 1) {
            setl.add(i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long k = scanner.nextLong();
        Set<Long> setl = new HashSet<>();
        setl.add(k);
        setl.add(k - 1);

        for (long x = 2; x <= Math.sqrt(k); x++) {
            check(k, x, setl);
            check(k, k / x, setl);
        }

        if (setl.contains(1L)) {
            setl.remove(1L);
        }

        System.out.println(setl.size());
    }
}
```
