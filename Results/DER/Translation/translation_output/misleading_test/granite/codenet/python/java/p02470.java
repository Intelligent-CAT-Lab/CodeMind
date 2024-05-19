System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6

Expected output:
38

```
import math

def primes(n):
    rn = int(math.sqrt(n))
    sieve = [1] * (rn + 1)
    for i in range(2, rn + 1):
        j = i * 2
        while j <= rn:
            sieve[j] = 0
            j += i
    p = [i for i in range(2, rn + 1) if sieve[i] == 1]
    return p

def phi_func(n, p):
    ans = n
    for q in p:
        if n % q == 0:
            ans = ans * (q - 1) // q
            while n % q == 0:
                n //= q
    else:
        if n > 1:
            ans = ans * (n - 1) // n
    return ans

line = input()
n = int(line)
p = primes(n)
print(phi_func(n, p))

```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sieve = new int[n+1];
        Arrays.fill(sieve, 1);
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (sieve[i] == 1) {
                for (int j = i * i; j <= n; j += i) {
                    sieve[j] = 0;
                }
            }
        }
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (sieve[i] == 1) {
                primes.add(i);
            }
        }
        int ans = n;
        for (int p : primes) {
            if (n % p == 0) {
                ans = ans * (p - 1) / p;
                while (n % p == 0) {
                    n /= p;
                }
            }
        }
        if (n > 1) {
            ans = ans * (n - 1) / n;
        }
        System.out.println(ans);
    }
}
```

Test input:
```
6
```

Expected output:
```
38
```<|endoftext|>
