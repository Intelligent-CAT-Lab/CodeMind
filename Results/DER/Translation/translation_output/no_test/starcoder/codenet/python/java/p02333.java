<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int modulo = 1000000007;
        int ans = 0;
        if (k <= n) {
            for (int i = 0; i < k; i++) {
                if (0 == i % 2) {
                    ans += (k - i) * Math.pow(k - i, n) * combination(k, i);
                } else {
                    ans -= (k - i) * Math.pow(k - i, n) * combination(k, i);
                }
            }
            ans = ans % modulo;
        }
        System.out.println(ans);
    }

    public static int combination(int n, int m) {
        int res = 1;
        for (int i = 1; i <= m; i++) {
            res = res * (n - i + 1) / i;
        }
        return res;
    }
}
```
<|endoftext|>
