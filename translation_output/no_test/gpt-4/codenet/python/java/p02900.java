Here's the translated Java code that encapsulates the Python code's functionality:

```java
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    
    public static ArrayList<Integer> primeFactorize(int n) {
        ArrayList<Integer> a = new ArrayList<>();
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

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        int gcd = gcd(A, B);
        Set<Integer> primeFactorSet = new HashSet<>(primeFactorize(gcd));
        
        ArrayList<Integer> primeFactor = new ArrayList<>(primeFactorSet);
        
        int ans = primeFactor.size();
        double subsets = Math.pow(2, primeFactor.size());
        
        for (int i = 0; i < subsets; ++i) {
            int iTemp = i;
            int j = 0;
            int composite = 1;
            int count = 0;
            while (iTemp != 0) {
                if (iTemp % 2 != 0) {
                    composite *= primeFactor.get(j);
                    count++;
                }
                j++;
                iTemp /= 2;
            }
            
            for (int prime : primeFactor) {
                if (prime == composite && count >= 2) {
                    ans--;
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

Make sure you execute the `main` method to run the code equivalent to the Python `solve()` function. Input is provided through the console, just like in the original Python code.

Please note that in Python 3, `fractions.gcd` has been deprecated and the function to find the GCD has been moved to `math.gcd`. I have included a manual implementation of the GCD function in the Java code in case you're using a version of Python without `fractions.gcd`.
