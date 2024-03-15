<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02639 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] x = new int[5];
        int sum=0;
        for(int i=0;i<5;i++){
            x[i] = sc.nextInt();
            sum += x[i];
        }
        System.out.println(15-sum);
    }

}

```

### 解题思路

```python
import java.util

class p02639:
    def main(self, args):
        sc = java.util.Scanner(System.in)
        x = [0]*5
        sum = 0
        for i in range(5):
            x[i] = sc.nextInt()
            sum += x[i]
        print(15-sum)

```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(n)。

### 相关题目

- [p02638](./p02638.md)
</s>
