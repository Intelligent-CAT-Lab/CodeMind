Here is the translated Java code from the provided Python code:

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        int gcd = gcd(A, B);
        List<Integer> primeFactors = primeFactorize(gcd);
        Set<Integer> primeFactorSet = new HashSet<>(primeFactors);
        
        int ans = primeFactorSet.size();
        for (int i = 0; i < (1 << primeFactorSet.size()); i++) {
            int composite = 1;
            int count = 0;
            int iTemp = i;
            for (int j = 0; j < primeFactorSet.size(); j++) {
                if ((iTemp & 1) == 1) {
                    composite *= (int) primeFactors.get(j);
                    count++;
                }
                iTemp >>= 1;
            }
            
            if (primeFactorSet.contains(composite) && count >= 2) {
                ans--;
            }
        }

        System.out.println(ans + 1);
    }

    private static List<Integer> primeFactorize(int n) {
        List<Integer> factors = new ArrayList<>();
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }
        int f = 3;
        while (f * f <= n) {
            if (n % f == 0) {
                factors.add(f);
                n /= f;
            } else {
                f += 2;
            }
        }
        if (n != 1) {
            factors.add(n);
        }
        return factors;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
```

This Java program should take two integers as input and print the correct output as described. Note that `fractions.gcd` in Python is replaced by a simple GCD function implemented using the Euclidean algorithm (`gcd` method in Java). Additionally, the `print` statement from Python is replaced with `System.out.println` in Java.
