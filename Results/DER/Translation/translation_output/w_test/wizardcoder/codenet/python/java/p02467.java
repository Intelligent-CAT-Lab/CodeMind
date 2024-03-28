Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
12

Expected output:
12: 2 2 3


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
        for (int p : primeFactorization(n)) {
            System.out.print(p + " ");
        }
    }

    public static List<Integer> primeFactorization(int n) {
        List<Integer> res = new ArrayList<>();
        if (n < 2) {
            res.add(n);
            return res;
        }

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

        return res;
    }
}
```<|endoftext|>
