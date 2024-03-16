<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        BigInteger modulo = BigInteger.valueOf(1000000007);
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
        BigInteger ans = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        for (int i = 2; i <= n - k; i++) {
            ans = ans.divide(BigInteger.valueOf(i));
        }
        return ans;
    }
}
```</s>
