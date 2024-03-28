<s> Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p02660 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = Long.parseLong(scan.next());
        scan.close();

        if (n == 1) {
            System.out.println(0);
            return;
        }

        Map<Long, Integer> pMap = new HashMap<Long, Integer>();
        for (long i = 2; i < Math.sqrt(n); i++) {
            int count = 0;
            while (n % i == 0) {
                count++;
                n /= i;
            }
            if (count > 0) {
                pMap.put(i, count);
            }
        }
        if (n != 1) {
            pMap.put(n, 1);
        }

        int ans = 0;
        for (int pCount : pMap.values()) {
            int i = 1;
            while (pCount >= i) {
                pCount -= i;
                ans++;
                i++;
            }
        }

        System.out.println(ans);
    }

}

```

### 解题思路

1. 使用 HashMap 存储 prime 数的个数
2. 使用 while 循环，判断 n 是否可以被 i 整除，如果可以，则将 n 除以 i，并将 i 的个数加 1
3. 如果 n 不能被 i 整除，则将 i 加入到 HashMap 中，并将 i 的个数加 1
4. 如果 n 不能被任何 prime 数整除，则将 n 加入到 HashMap 中，并将 n 的个数加 1
5. 使用 while 循环，从 HashMap 中取出 prime 数，判断 prime 数是否能整除 n，如果能整除，则将 prime 数的个数减 1，如果不能整除，则将 prime 数的个数减 1，如果 prime 数的个数为 0，则将 prime 数从 HashMap 中移除
6. 如果 n 不能被任何 prime 数整除，则将 n 从 HashMap 中移除，并将 n 的个数减 1
7. 如果 HashMap 中的所有 prime 数的个数都为 0，则 n 是 prime 数

### 代码

```python
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class p02660:

    def __init__(self):
        pass

    def main(self):
        n = int(input())
        if n == 1:
            print(0)
            return
        pMap = {}
        for i in range(2, int(math.sqrt(n)) + 1):
            count = 0
            while n % i == 0:
                count += 1
                n //= i
            if count > 0:
                pMap[i] = count
            if n != 1:
                pMap[n] = 1
        ans = 0
        for i in pMap.values():
            i = 1
            while i <= i:
                i -= i
                ans += 1
                i += 1
        for i in pMap.values():
            if i == 0:
                pMap.pop(i)
                n -= 1
        if n == 0:
            print(ans)
        else:
            print(n)

```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(n)。

### 相关题目

1. [牛客网](https://www.nowcoder.com/practice/b999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999
