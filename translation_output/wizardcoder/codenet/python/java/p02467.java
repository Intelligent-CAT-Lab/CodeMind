Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(n + ": ");
        for (int p : primeFactorization(n)) {
            System.out.print(p + " ");
        }
    }

    public static int[] primeFactorization(int n) {
        if (n < 2) {
            return new int[]{n};
        }

        int[] res = new int[0];
        int lim = (int) Math.sqrt(n);

        for (int p = 2; p <= lim; p++) {
            while (n % p == 0) {
                res = add(res, p);
                n /= p;
            }
        }

        if (n > 1) {
            res = add(res, n);
        }

        return res;
    }

    public static int[] add(int[] arr, int val) {
        int[] res = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        res[arr.length] = val;
        return res;
    }
}
```<|endoftext|>
