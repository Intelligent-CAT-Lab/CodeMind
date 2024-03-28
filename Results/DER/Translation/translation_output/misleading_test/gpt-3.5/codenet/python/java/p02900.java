```java
import java.util.*;
import java.math.*;

public class Main {
    public static List<Integer> primeFactorize(int n) {
        List<Integer> a = new ArrayList<>();
        while (n % 2 == 0) {
            a.add(2);
            n /= 2;
        }
        int f = 3;
        while (f * f <= n) {
            if (n % f == 0) {
                a.add(f);
                n /= f;
            } else {
                f += 2;
            }
        }
        if (n != 1) {
            a.add(n);
        }
        return a;
    }

    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int gcd = BigInteger.valueOf(A).gcd(BigInteger.valueOf(B)).intValue();
        List<Integer> primeFactor = new ArrayList<>(new HashSet<>(primeFactorize(gcd)));

        int ans = primeFactor.size();
        for (int i = 0; i < Math.pow(2, primeFactor.size()); i++) {
            int iTemp = i;
            int j = 0;
            int composite = 1;
            int count = 0;
            while (iTemp != 0) {
                if (iTemp % 2 == 1) {
                    composite *= primeFactor.get(j);
                    count++;
                }
                j++;
                iTemp /= 2;
            }

            for (int prime : primeFactor) {
                if (prime == composite && count >= 2) {
                    ans--;
                    break;
                }
            }
        }

        System.out.println(ans + 1);
    }

    public static void main(String[] args) {
        solve();
    }
}
```
