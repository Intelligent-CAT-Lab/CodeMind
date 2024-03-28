Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
12

Expected output:
12: 2 3

```
import sys
from math import sqrt

def solve():
    n = int(input())

    print('{}: '.format(n), end='')
    print(*prime_factorization(n))

def prime_factorization(n):
    if n < 2:
        return [n]

    res = []
    lim = int(sqrt(n))

    for p in range(2, lim + 1):
        while n % p == 0:
            res.append(p)
            n //= p

    if n > 1:
        res.append(n)

    return res

if __name__ == '__main__':
    solve()
```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.print(n + ": ");
        List<Integer> factors = primeFactorization(n);
        for (int i = 0; i < factors.size(); i++) {
            System.out.print(factors.get(i) + " ");
        }
    }

    public static List<Integer> primeFactorization(int n) {
        List<Integer> factors = new ArrayList<>();
        if (n < 2) {
            factors.add(n);
            return factors;
        }

        int lim = (int) Math.sqrt(n);

        for (int p = 2; p <= lim; p++) {
            while (n % p == 0) {
                factors.add(p);
                n /= p;
            }
        }

        if (n > 1) {
            factors.add(n);
        }

        return factors;
    }
}
```<|endoftext|>
