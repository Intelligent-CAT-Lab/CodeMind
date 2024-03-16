<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class p03416 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int count = 0;
    for (int i = a; i <= b; i++) {
      int[] array = new int[5];
      array[0] = i % 10;
      array[1] = i / 10 % 10;
      array[2] = i / 100 % 10;
      array[3] = i / 1000 % 10;
      array[4] = i / 10000 % 10;
      if (array[0] == array[4] && array[1] == array[3]) {
        count++;
      }
    }
    System.out.println(count);
  }
}
```

### 解题思路

```python
import java.util

class p03416:
    def main(self, args):
        sc = java.util.Scanner(System.in)
        a = sc.nextInt()
        b = sc.nextInt()
        count = 0
        for i in range(a, b+1):
            array = [i % 10, i / 10 % 10, i / 100 % 10, i / 1000 % 10, i / 10000 % 10]
            if array[0] == array[4] and array[1] == array[3]:
                count += 1
        print(count)
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [p03415](/p03415)
</s>
