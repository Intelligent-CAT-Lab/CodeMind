<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class p03583 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        // a
        for (int i = 1; i < 3510; i++) {
            // b
            for (int j = 1; j < 3510; j++) {
                long si = n * i * j;
                long bo = 4 * i * j - n * j - n * i;
                if (bo <= 0) {
                    continue;
                }
                if (si % bo == 0) {
                    System.out.println(i + " " + j + " " + (si / bo));
                    return;
                }
            }
        }
    }
}

```

### 解题思路

```python
import math

def main():
    n = int(input())
    for i in range(1, 3510):
        for j in range(1, 3510):
            si = n * i * j
            bo = 4 * i * j - n * j - n * i
            if bo <= 0:
                continue
            if si % bo == 0:
                print(i, j, si // bo)
                return

if __name__ == '__main__':
    main()
```

### 复杂度分析

- 时间复杂度：O(n^2)。
- 空间复杂度：O(1)。

### 相关题目

- [p03582](https://leetcode-cn.com/problems/p03582/)
</s>
