<s> Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
from fractions import gcd


def main():
    n, k = map(int, input().split())

    ans = 0

    if k % 2 == 1:
        ans = (n // k)**3
    else:
        ans = (n // k)**3 + ((n + k // 2) // k)**3
    
    print(ans)


if __name__ == '__main__':
    main()

```

### 解题思路

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        if (k % 2 == 1) {
            ans = (n / k) * (n / k) * (n / k);
        } else {
            ans = (n / k) * (n / k) * (n / k) + ((n + k / 2) / k) * (n + k / 2) / k;
        }
        System.out.println(ans);
    }
}
```

### 复杂度分析

- 时间复杂度：O(1)。
- 空间复杂度：O(1)。

### 相关题目

- [Python3 题目 100](https://leetcode-cn.com/problems/python3-problem-100-lcci/)
</s>
