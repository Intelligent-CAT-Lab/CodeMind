<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Arrays;
import java.util.Scanner;

public class p03352 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = {1, 4, 8, 16, 32, 64, 128, 256, 512,  9, 27, 81, 243, 729,  16, 64, 256, 1024, 25, 125, 625,  36, 216,  49, 343,  64, 512,  81, 729,  100, 1000, 121,  144,  169,  196,  225,  256,  289,  324,  361,  400, 441, 484,  529,  576,  625,  676,  729,  784,  841, 900,  961};
        Arrays.sort(num);
        int X = sc.nextInt();
        int max = -1;
        for(int i = num.length; i > 0; i--){
            int n = num[i - 1];
            if(n <= X){
                max = Math.max(max, n);
                break;
            }
        }
        System.out.println(max);
    }
}

```

### 解题思路

```python
import java.util.Arrays;
import java.util.Scanner;

class p03352:
    def __init__(self):
        pass

    def main(self):
        sc = Scanner(System.in)
        num = [1, 4, 8, 16, 32, 64, 128, 256, 512,  9, 27, 81, 243, 729,  16, 64, 256, 1024, 25, 125, 625,  36, 216,  49, 343,  64, 512,  81, 729,  100, 1000, 121,  144,  169,  196,  225,  256,  289,  324,  361,  400, 441, 484,  529,  576,  625,  676,  729,  784,  841, 900,  961]
        num.sort()
        X = sc.nextInt()
        max = -1
        for i in range(len(num)):
            n = num[i]
            if n <= X:
                max = max(max, n)
                break
        print(max)
```

### 复杂度分析

- 时间复杂度：O(nlogn)。
- 空间复杂度：O(1)。

### 相关题目

- [p03351](./p03351.md)
</s>
