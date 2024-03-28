<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p03671{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] sum = {a,b,c};
        Arrays.sort(sum);

        System.out.println(sum[0]+sum[1]);
    }

}

```

### 解题思路

```python
import java.util

class p03671:
    def main(self, args):
        sc = java.util.Scanner(System.in)
        a = sc.nextInt()
        b = sc.nextInt()
        c = sc.nextInt()

        sum = [a, b, c]
        java.util.Arrays.sort(sum)

        print(sum[0] + sum[1])
```

### 复杂度分析

- 时间复杂度：O(nlogn)。
- 空间复杂度：O(1)。

### 相关题目

- [p03670](./p03670.md)
</s>
