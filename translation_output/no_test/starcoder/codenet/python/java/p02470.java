<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            p[i] = i;
        }
        for (int i = 2; i <= n; i++) {
            if (p[i] == i) {
                for (int j = i; j <= n; j += i) {
                    p[j] = p[j] / i * (i - 1);
                }
            }
        }
        System.out.println(p[n]);
    }
}
```
<|endoftext|>
