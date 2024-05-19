System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long ans = 0;
        long mod = 100000007;
        if (k <= n) {
            for (int i = 0; i < k; i++) {
                if (i % 2 == 0) {
                    ans += (long) Math.pow(k - i, n) * combination(k, i) % mod;
                } else {
                    ans -= (long) Math.pow(k - i, n) * combination(k, i) % mod;
                }
            }
            ans = (ans % mod + mod) % mod;
        }
        System.out.println(ans);
    }

    public static long combination(int n, int m) {
        if (m > n - m) {
            m = n - m;
        }
        long up = 1;
        long down = 1;
        for (int i = 0; i < m; i++) {
            up = up * (n - i) % 100000007;
            down = down * (i + 1) % 100000007;
        }
        return up / down;
    }
}
```<|endoftext|>
