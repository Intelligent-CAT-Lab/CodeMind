<s> Translate the following python code to java and enclose your solution inside ```java```:
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

### 解题思路

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int ans = 0;
        if (k <= n) {
            for (int i = 0; i < k; i++) {
                if (i % 2 == 0) {
                    ans += (k - i) * (k - i) * (k - i) * combination(k, i);
                } else {
                    ans -= (k - i) * (k - i) * (k - i) * combination(k, i);
                }
            }
            ans = ans % 1000000007;
        }
        System.out.println(ans);
    }

    public static int combination(int i, int j) {
        return (int) (Math.factorial(i) / Math.factorial(i - j) / Math.factorial(j));
    }
}
```

### 复杂度分析

- 时间复杂度：O(k^2)。
- 空间复杂度：O(1)。

### 相关题目

- [Python](https://leetcode-cn.com/problems/combination-sum-ii/)
- [Java](https://leetcode-cn.com/problems/combination-sum-ii/solution/java-solution-1/)
</s>
