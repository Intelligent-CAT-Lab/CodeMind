System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(n + ": ");
        printPrimeFactors(n);
    }

    public static void printPrimeFactors(int n) {
        if (n < 2) {
            System.out.print(n);
            return;
        }

        int lim = (int) Math.sqrt(n);
        for (int p = 2; p <= lim; p++) {
            while (n % p == 0) {
                System.out.print(p + " ");
                n /= p;
            }
        }

        if (n > 1) {
            System.out.print(n);
        }
    }
}
```

Test input:
12

Expected output:
12: 2 2 3
<|endoftext|>
