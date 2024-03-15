Below is the translation of the given Python code to Java:

```java
import java.util.Arrays;
import java.util.Scanner;

public class PrimePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int root = (int)Math.sqrt(n) + 1;
        boolean[] isPrime = new boolean[n + 3];
        Arrays.fill(isPrime, true);
        for (int i = 4; i < n + 3; i += 2) {
            isPrime[i] = false;
        }
        
        int ans = 0;
        int prePrime = -1;
        for (int i = 3; i < n + 3; i += 2) {
            if (isPrime[i]) {
                if (prePrime + 2 == i) {
                    ans += 2;
                }
                
                prePrime = i;
                if (i > root) {
                    continue;
                }
                for (int j = i * i; j < n + 3; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        System.out.println(ans);
        
        scanner.close();
    }
}
```

Make sure to import the necessary classes (`java.util.Scanner` and `java.util.Arrays`) at the beginning of the Java code. The input and output will be managed using `Scanner` and `System.out`. The array `isPrime` has been declared as a boolean array and initialized with `true` using `Arrays.fill()` instead of list comprehension as in Python. The main loop and filling non-prime positions carry over similarly, respecting Java's syntax.
