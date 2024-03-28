<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.print("{}: ".format(n));
        List<Integer> primeFactors = primeFactorization(n);
        for (int factor : primeFactors) {
            System.out.print(factor + " ");
        }
    }

    public static List<Integer> primeFactorization(int n) {
        if (n < 2) {
            return new ArrayList<>(Arrays.asList(n));
        }

        List<Integer> factors = new ArrayList<>();
        int limit = (int) Math.sqrt(n);

        for (int p = 2; p <= limit; p++) {
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
```</s>
