Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 3

Expected output:
36


```
import math


def combination(i: int, j: int) -> int:
    return math.factorial(i) // math.factorial(i - j) // math.factorial(j)


if __name__ == "__main__":
    n, k = map(lambda x: int(x), input().split())
    modulo = 10 ** 9 + 7
    ans = 0
    if k <= n:
        for i in range(k):
            if 0 == i % 2:
                ans += (k - i) ** n * combination(k, i)
            else:
                ans -= (k - i) ** n * combination(k, i)
        ans = ans % modulo

    print(ans)


```

### Response:
```java
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        BigInteger modulo = BigInteger.valueOf(10).pow(9).add(BigInteger.valueOf(7));
        BigInteger ans = BigInteger.ZERO;

        if (k <= n) {
            for (int i = 0; i < k; i++) {
                if (i % 2 == 0) {
                    ans = ans.add(BigInteger.valueOf(k - i).pow(n).multiply(combination(k, i)));
                } else {
                    ans = ans.subtract(BigInteger.valueOf(k - i).pow(n).multiply(combination(k, i)));
                }
            }
            ans = ans.mod(modulo);
        }

        System.out.println(ans);
    }

    public static BigInteger combination(int n, int k) {
        BigInteger numerator = factorial(n);
        BigInteger denominator = factorial(k).multiply(factorial(n - k));
        return numerator.divide(denominator);
    }

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
```<|endoftext|>
