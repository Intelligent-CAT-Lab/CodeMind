<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        System.out.print(n + ": ");
        for (int p : primeFactorization(n)) {
            System.out.print(p + " ");
        }
        System.out.println();
    }

    public static int[] primeFactorization(int n) {
        if (n < 2) {
            return new int[] { n };
        }

        int[] res = new int[0];
        int lim = (int) Math.sqrt(n);

        for (int p = 2; p <= lim; p++) {
            while (n % p == 0) {
                res = append(res, p);
                n /= p;
            }
        }

        if (n > 1) {
            res = append(res, n);
        }

        return res;
    }

    public static int[] append(int[] arr, int value) {
        int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[arr.length] = value;
        return newArr;
    }
}
```
Note: The `append` method is used to append an element to an array in Java. It creates a new array with the same elements as the original array, and then adds the new element to the end of the new array.</s>
